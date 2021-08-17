/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/


package canadian.payroll;

import java.util.*;
import canadian.*;

public class GovernmentTax extends Deduction {

	boolean isProvincial = false;
	public static class TaxUtil {

		public static Map<Integer, TaxCategory> getEmployeeCategories( String provinceOrFederal ) {

			provinceOrFederal = Utility.formatProvince( provinceOrFederal.toLowerCase() );
			switch( provinceOrFederal ) {
				case "AB" : return alberta();
				case "BC" : return britishColumbia();
				case "MB" : return manitoba();
				case "NB" : return newBrunswick();
				case "NS" : return novaScotia();
				case "ON" : return ontario();
				case "SK" : return saskatchewan();
				default : return federal();
			}
		}

		//declares the catgeroies for the province of Manitoba
		public static Map<Integer, TaxCategory> manitoba() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				TaxCategory cat1 = new TaxCategory(10.8, 0, 33723);
				categories.put( 1, cat1 );
				TaxCategory cat2 = new TaxCategory(12.75, 33723.01, 72885);
				categories.put( 2, cat2 );
				TaxCategory cat3 = new TaxCategory(17.4, 72885.01, 100000000);
				categories.put( 3, cat3 );
			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the province of Alberta
		public static Map<Integer, TaxCategory> alberta() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(10, 0, 131220); // Tax Category 1 for Alberta
				categories.put( 1, cat1 ); //puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory(12,131220.01, 157464); // Tax Category 2 for Alberta
				categories.put( 2, cat2 ); //puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(13, 157464.01, 209952); // Tax Category 3 for Alberta
				categories.put( 3, cat3 );//puts both the key and the Taxcategory(value) into the hashmap for category 3
				TaxCategory cat4 = new TaxCategory(14, 209952.01, 314928); // Tax Category 4 for Alberta
				categories.put( 4, cat4 );//puts both the key and the Taxcategory(value) into the hashmap for category 4
				TaxCategory cat5 = new TaxCategory(15, 314928.01, 10000000); // Tax Category 5 for Alberta
				categories.put( 5, cat5 );//puts both the key and the Taxcategory(value) into the hashmap for category 5

			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the province of Quebec
		public static Map<Integer, TaxCategory> britishColumbia() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(5.06, 0, 42184.00); // Tax Category 1 for BC
				categories.put( 1, cat1 );//puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory(7.70, 42184.01, 84369.00); // Tax Category 2 for BC
				categories.put( 2, cat2 );//puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(10.50, 84369.01, 96866.00); // Tax Category 3 for BC
				categories.put( 3, cat3 );//puts both the key and the Taxcategory(value) into the hashmap for category 3
				TaxCategory cat4 = new TaxCategory(12.29, 96866.01, 117623.00); // Tax Category 4 for BC
				categories.put( 4, cat4 );//puts both the key and the Taxcategory(value) into the hashmap for category 4
				TaxCategory cat5 = new TaxCategory(14.70, 117623.01, 159483.00); // Tax Category 5 for BC
				categories.put( 5, cat5 );//puts both the key and the Taxcategory(value) into the hashmap for category 5
				TaxCategory cat6 = new TaxCategory(16.80, 159483.01, 222420.00); // Tax Category 6 for BC
				categories.put( 6, cat6 );//puts both the key and the Taxcategory(value) into the hashmap for category 6
				TaxCategory cat7 = new TaxCategory(20.50, 222420.01, 10000000); // Tax Category 7 for BC
				categories.put( 7, cat7 );//puts both the key and the Taxcategory(value) into the hashmap for category 7

			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the province of New Brunswick
		public static Map<Integer, TaxCategory> newBrunswick() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(9.68, 0, 43835); //Tax Category 1 for NewBrunswick
				categories.put( 1, cat1 ); //puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory(14.82, 43835.01, 87671); //Tax Category 1 for NewBrunswick
				categories.put( 2, cat2 ); //puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(16.52, 87671.01, 142534); //Tax Category 1 for NewBrunswick
				categories.put( 3, cat3 ); //puts both the key and the Taxcategory(value) into the hashmap for category 3
				TaxCategory cat4 = new TaxCategory(17.84, 142534.01, 162383); //Tax Category 1 for NewBrunswick
				categories.put( 4, cat4 ); //puts both the key and the Taxcategory(value) into the hashmap for category 4
				TaxCategory cat5 = new TaxCategory(20.3, 162383.01, 10000000); //Tax Category 1 for NewBrunswick
				categories.put( 5, cat5 ); //puts both the key and the Taxcategory(value) into the hashmap for category 5

			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the province of Nova Scotia
		public static Map<Integer, TaxCategory> novaScotia() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(8.79, 0, 29590.00); //Tax Category 1 for NS
				categories.put( 1, cat1 ); //puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory(14.95, 29590.01, 59180.00); //Tax Category 2 for NS
				categories.put( 2, cat2 ); //puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(16.67, 59180.01, 93000.00); //Tax Category 3 for NS
				categories.put( 3, cat3 ); //puts both the key and the Taxcategory(value) into the hashmap for category 3
				TaxCategory cat4 = new TaxCategory(17.50, 93000.01, 150000.00); //Tax Category 4 for NS
				categories.put( 4, cat4 ); //puts both the key and the Taxcategory(value) into the hashmap for category 4
				TaxCategory cat5 = new TaxCategory(21.00, 150000.01, 10000000); //Tax Category 15for NS
				categories.put( 5, cat5 ); //puts both the key and the Taxcategory(value) into the hashmap for category 5

			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the province of Ontario
		public static Map<Integer, TaxCategory> ontario() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(5.05, 0, 44740); //Tax Category 1 for ON
				categories.put( 1, cat1 ); //puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory(9.15, 44740.01, 89482);//Tax Category 2 for ON
				categories.put( 2, cat2 );//puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(11.16, 89482.01, 150000);//Tax Category 3 for ON
				categories.put( 3, cat3 );//puts both the key and the Taxcategory(value) into the hashmap for category 3
				TaxCategory cat4 = new TaxCategory(12.16, 150000.01, 220000);//Tax Category 4 for ON
				categories.put( 4, cat4 );//puts both the key and the Taxcategory(value) into the hashmap for category 4
				TaxCategory cat5 = new TaxCategory(13.16, 220000.01, 10000000);//Tax Category 5 for ON
				categories.put( 5, cat5 ); //puts both the key and the Taxcategory(value) into the hashmap for category 5

			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the province of saskatchewan
		public static Map<Integer, TaxCategory> saskatchewan() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(10.5, 0, 45677.00); //Tax Category 1 for SK
				categories.put( 1, cat1 );//puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory(12.50, 45677.01, 130506.00);//Tax Category 2 for SK
				categories.put( 2, cat2 );//puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(13.16, 130506.01, 10000000);//Tax Category 3 for SK
				categories.put( 3, cat3 );//puts both the key and the Taxcategory(value) into the hashmap for category 3

			} catch( Exception e ) {}

			return categories;
		}

		//declares the catgeroies for the federal government
		public static Map<Integer, TaxCategory> federal() {

			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				TaxCategory cat1 = new TaxCategory(15, 0, 49020); //Tax Category 1 for federal
				categories.put( 1, cat1 );//puts both the key and the Taxcategory(value) into the hashmap for category 1
				TaxCategory cat2 = new TaxCategory( 20.5, 49020.01, 98040); //Tax Category 2 for federal
				categories.put( 2, cat2 );//puts both the key and the Taxcategory(value) into the hashmap for category 2
				TaxCategory cat3 = new TaxCategory(26, 98040.01, 151978); //Tax Category 3 for federal
				categories.put( 3, cat3 );//puts both the key and the Taxcategory(value) into the hashmap for category 3
				TaxCategory cat4 = new TaxCategory(29, 151978.01, 216511); //Tax Category 4 for federal
				categories.put( 4, cat4 );//puts both the key and the Taxcategory(value) into the hashmap for category 4
				TaxCategory cat5 = new TaxCategory(33, 216511.01, 10000000); //Tax Category 5 for federal
				categories.put( 5, cat5 );//puts both the key and the Taxcategory(value) into the hashmap for category 5

			} catch( Exception e ) {}

			return categories;
		}
	}

	private Map<Integer, TaxCategory> categories;
	public GovernmentTax( Employee employee, String provinceOrFederal ) {

		super( employee );
		String province = provinceOrFederal;
		if( !( provinceOrFederal.equals("federal") || provinceOrFederal.equals( "fed" ) ) ) {
			province = employee.getProvince();
			isProvincial = true;
		}
		this.categories = TaxUtil.getEmployeeCategories( province );
	}

	public double computeAmount() {
		double income = employee.getIncome();
		//INSERT YOUR CODE HERE
		double totalTax = 0;

		if(isProvincial){ //checks if isprovincial == true
			//System.out.println(" I'm here");
			if(employee.getProvince().equals("alberta")  ||employee.getProvince().equals("AB") || employee.getProvince().equals("ab") || employee.getProvince().equals("Alberta")){ //gets employee's province and comparies to this if condition
				if(income <= 131220){ //checks if income falls into this category
					totalTax = income * .10; //income calculated according to the category

				}
				else if(income >= 131220.01 && income <= 157464){ //checks if income falls into this category
					totalTax = ((income - 131220) * .12) + (131220 * .10); // //income calculated according to the category
				}
				else if(income >= 157464.01 && income <= 209952){ //checks if income falls into this category
					totalTax = ((income - 157464) * .13)+ ((157464 - 131220) * .12) + (131220 * .10); //income calculated according to the category
				}
				else if(income >= 209952.01 && income <= 314928){ //checks if income falls into this category
					totalTax = ((income - 209952) * .14) + ((209952 - 157464) * .13)+ ((157464 - 131220) * .12) + (131220 * .10); //income calculated according to the category
				}
				else if(income >= 314928.01){ //checks if income falls into this category
					totalTax = ((income - 314928) * .15) + ((314928 - 209952) * .14) + ((209952 - 157464) * .13)+ ((157464 - 131220) * .12) + (131220 * .10); //income calculated according to the category
				}

			}
			else if(employee.getProvince().equals("BC")  ||employee.getProvince().equals("bc") || employee.getProvince().equals("BritishColumbia") || employee.getProvince().equals("britishcolumbia") ){ //gets employee's province and comparies to this if condition

				if(income <= 42184){
					totalTax = (income * 0.0506); //income calculated according to the category
				}
				else if(income >= 42184.01 && income <= 84369.00){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 42184) * 0.077) + (42184 * 0.0506); //income calculated according to the category
				}
				else if(income >= 84369.01 && income <= 96866.00){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 84369) * .105) + ((84369 - 42184) * 0.077) + (42184 * 0.0506); //income calculated according to the category
				}
				else if(income >= 96866.01 && income <= 117623){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 96866) * 0.1229) + ((96866 - 84369) * 0.105) + ((84369 - 42184) * 0.077) + (42184 * 0.0506); //income calculated according to the category
				}
				else if(income >= 117623.01 && income <= 159483){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 117623) * 0.147) + ((117623 - 96866) * 0.1229) + ((96866 - 84369) * 0.1050) + ((84369 - 42184) * 0.077) + (42184 * 0.0506); //income calculated according to the category
				}
				else if(income >= 159483.01 && income <= 222420){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 159483) * 0.168) +  ((159483 - 117623) * 0.147) + ((117623 - 96866) * 0.1229) +((96866 - 84369) * 0.1050) + ((84369 - 42184) *0.077) + (42184 * 0.0506); //income calculated according to the category
				}
				else if(income >= 22420.01){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 222420) * 0.2050) + ((222420 - 159483) * 0.1680) + ((159483 - 117623) * 0.147) + ((117623 - 96866) * 0.1229) +((96866 - 84369) * 0.1050) + ((84369 - 42184) *0.077) + (42184 * 0.0506); //income calculated according to the category
				}
			}
			else if(employee.getProvince().equals("Manitoba")  ||employee.getProvince().equals("manitoba") || employee.getProvince().equals("MB") || employee.getProvince().equals("mb")){ //gets employee's province and comparies to this if condition
				if(income <= 33723){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = (income * .1080); //income calculated according to the category

				}
				else if(income >= 33723.01 && income <= 72885){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 33723) * .1275) + (33723 * 0.1080); //income calculated according to the category

				}
				else if(income >= 72885.01){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 72885) * 0.1740) + ((72885 - 33723) * .1275) + (33723 * 0.1080); //income calculated according to the category

				}
			}
			else if(employee.getProvince().equals("nb")  ||employee.getProvince().equals("NB") || employee.getProvince().equals("NewBrunswick") || employee.getProvince().equals("newbrunswick")){ //gets employee's province and comparies to this if condition
				if(income <= 43835){
					totalTax = (income * 0.0968); //income calculated according to the category

				}
				else if(income >= 43835.01 && income <= 87671){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 43835) * .1482) + (43835 * 0.0968); //income calculated according to the category

				}
				else if(income >= 87671.01 && income <= 142534){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 87671) * .1652) + ((87671 - 43835) * .1482) + (43835 * 0.0968); //income calculated according to the category

				}
				else if(income >= 142534.01 && income <= 162383){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 142535) * .1784) +((142534 - 87671) * .1652) + ((87671 - 43835) * .1482) + (43835 * 0.0968); //income calculated according to the category

				}
				else if(income >= 162383.01){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 162383) * .2030) + ((162383 - 142535) * .1784) +((142534 - 87671) * .1652) + ((87671 - 43835) * .1482) + (43835 * 0.0968); //income calculated according to the category

				}
			}
			else if(employee.getProvince().equals("NS")  ||employee.getProvince().equals("ns") || employee.getProvince().equals("novascotia") || employee.getProvince().equals("NovaScotia")){ //gets employee's province and comparies to this if condition
				if(income <= 29590){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = (income * 0.0879);
				}
				else if(income >= 29590.01 && income <= 59180){ //checks if condition is true and if it is true, then code block below is executed
					totalTax =  ((income - 29590) * 0.1495) + (29590 * 0.0879); //income calculated according to the category
				}
				else if(income >= 59180.01 && income <= 93000){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 59180) * 0.1667) + ((59180 - 29590) * 0.1495) + (29590 * 0.0879); //income calculated according to the category
				}
				else if(income >= 93000.01 && income <= 150000){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 93000) * 0.1750) + ((93000 - 59180) * 0.1667) + ((59180 - 29590) * 0.1495) + (29590 * 0.0879); //income calculated according to the category
				}
				else if(income >= 150000.01){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 150000) * 0.21) + ((150000 - 93000) * 0.1750) + ((93000 - 59180) * 0.1667) + ((59180 - 29590) * 0.1495) + (29590 * 0.0879); //income calculated according to the category
				}
			}
			else if(employee.getProvince().equals("on")  ||employee.getProvince().equals("ON") || employee.getProvince().equals("Ontario") || employee.getProvince().equals("ontario")){ //gets employee's province and comparies to this if condition
				if(income <= 44740){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = (income * 0.0505);

				}
				else if(income >= 44740.01 && income <= 89482){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 44740) * .0915) + (44740 * .0505); //income calculated according to the category

				}
				else if(income >= 89482.01 && income <= 150000){ //checks if condition is true and if it is true, then code block below is executed
					totalTax =  ((income - 89482) * .1116) + ((89482 - 44740) * .0915) + (44740 * .0505); //income calculated according to the category

				}
				else if(income >= 150000.01 && income <= 220000){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 150000) * .1216)  + ((150000 - 89482) * .1116) + ((89482 - 44740) * .0915) + (44740 * .0505); //income calculated according to the category

				}
				else if(income >= 220000.01){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 220000) * .1316) + ((220000 - 150000) * .1216)  + ((150000 - 89482) * .1116) + ((89482 - 44740) * .0915) + (44740 * .0505); //income calculated according to the category

				}
			}
			else if(employee.getProvince().equals( "Saskatchewan") || employee.getProvince().equals( "saskatchewan") || employee.getProvince().equals( "sk") ||employee.getProvince().equals( "SK")){ //gets employee's province and comparies to this if condition
				if(income <= 45677){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = (income * 0.1050); //income calculated according to the category
				}
				else if(income >= 45677.01 && income <= 130506){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 45677) * .1250) + (45677 * .1050); //income calculated according to the category
				}
				else if(income >= 130506.01){ //checks if condition is true and if it is true, then code block below is executed
					totalTax = ((income - 130506) * .1316) + ((130506 - 45677) * .1250) + (45677 * .1050); //income calculated according to the category
				}
			}


		}
		else{

			if(income <= 49020){ //checks if condition is true and if it is true, then code block below is executed
				totalTax = (income * .15); //calculates federal tax which is same for everyone from every province in the respective categories
			}
			else if(income >= 49020.01 && income <= 98040){ //checks if condition is true and if it is true, then code block below is executed
				totalTax = ((income - 49020) * .2050) + (49020 * .15); //calculates federal tax which is same for everyone from every province in the respective categories
			}
			else if(income >= 98040.01 && income <= 151987){ //checks if condition is true and if it is true, then code block below is executed
				totalTax = ((income - 98040) * .26) + ((98040 - 49020) * .2050) + (49020 * .15); //calculates federal tax which is same for everyone from every province in the respective categories
			}
			else if(income >= 151987.01 && income <= 216511){ //checks if condition is true and if it is true, then code block below is executed
				totalTax = ((income - 151987) * .29) + ((151987 - 98040) * .26) + ((98040 - 49020) * .2050) + (49020 * .15); //calculates federal tax which is same for everyone from every province in the respective categories
			}
			else if(income >= 216511.01){ //checks if condition is true and if it is true, then code block below is executed
				totalTax = ((income - 216511) * .33) + ((216511 - 151987) * .29) + ((151987 - 98040) * .26) + ((98040 - 49020) * .2050) + (49020 * .15); //calculates federal tax which is same for everyone from every province in the respective categories
			}

		}
		return totalTax;
	}

	public double getAmount() {
		return Math.round( computeAmount() * 100.0 ) / 100.0;
	}

	public boolean isProvincial() {
		return isProvincial;
	}
}