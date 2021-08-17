/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/


package canadian.payroll;

public class CPP extends Deduction {

	public CPP( Employee employee ) {
		super( employee );
	}

	public double computeAmount() {

		double income = employee.getIncome();
		//INSERT YOUR CODE HERE - Using the specification given on CPP
		double CPP = 0;
		if(income * 0.0525 > 2898 ){
			CPP = 2898;
		}
		else{
			CPP = income * .0525;
		}

		return CPP;
	}

	public double getAmount() {
		amount = computeAmount(); //computes the applicable CPP
		amount = Math.round( amount * 100.0 ) / 100.0; //rounding off to 2dp
		return amount;
	}
}