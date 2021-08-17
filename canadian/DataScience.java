/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/


package canadian;

import canadian.payroll.*;
import canadian.payroll.Employee;
import java.util.*;


public class DataScience {

	//argument the map of employees for the target province
	public static Employee leastPaidEmployee( String province, Map<Integer, Employee> map ) {
		//INSERT YOUR CODE HERE - study how allEmployees(...) is being implemented
		Employee leastPaid = new Employee();
		map = allEmployeesOf( province, map);
		double minimum = Double.MAX_VALUE;
		for(Map.Entry<Integer, Employee> entry : map.entrySet()){
			double income = entry.getValue().getIncome();
			if(minimum > income){
				minimum = income;
				leastPaid = entry.getValue();
			}
		}




//		if( map != null ) {
//			double minimum = map.get(1).getIncome();
////			int i = 2;
////			for(Map.Entry<Integer, Employee> entry : map.entrySet()){
////
////				if( minimum > map.get(i).getIncome()){
////					minimum = map.get(i).getIncome();
////					leastPaid = (Employee) entry.getValue();
////				}
////				i++;
////			}
//
//		}

		return leastPaid;
	}

	//argument the map of employees for the target province
	public static Employee highestPaidEmployee( String province, Map<Integer, Employee> map ) {

		//INSERT YOUR CODE HERE - see how allEmployees(...) is being implemented below. You may even reuse the code as well
		Employee highestpaid = new Employee();
		map = allEmployeesOf(province,map);
		double maximum = Double.MIN_VALUE;
		for(Map.Entry<Integer, Employee> entry : map.entrySet()){
			double income = entry.getValue().getIncome();
			if(maximum < income){
				maximum = income;
				highestpaid = entry.getValue();
			}
		}


		return highestpaid;
	}

	//computes a list of all employees by their province of residence
	public static Map<Integer, Employee> allEmployeesOf( String province, Map<Integer, Employee> map ) {

		province = Utility.formatProvince( province );
		Map<Integer, Employee> empMap = new Hashtable<Integer, Employee>();
		for( Map.Entry<Integer, Employee> entry : map.entrySet() ) {

			int key = entry.getKey();
			Employee value =  entry.getValue();
			if( value.getProvince().equals( province ) ) {
				empMap.put( key, value );
			}
		}
		return empMap;
	}
}