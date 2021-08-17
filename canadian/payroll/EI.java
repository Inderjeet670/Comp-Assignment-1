/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/


package canadian.payroll;

public class EI extends Deduction {

	public EI( Employee employee ) {
		super( employee );
	}

	public double computeAmount() {

		double income = employee.getIncome();
		double EITax;
		//INSERT YOUR CODE HERE - Using the specification given on EI
		if(income * 0.0158 > 856.36){
			EITax = 856.36;
		}
		else{
			EITax = income * 0.0158;
		}

		return EITax;
	}

	public double getAmount() {
		amount = computeAmount(); //computes the applicable EI
		amount = Math.round( amount * 100.0 ) / 100.0; //rounding off to 2dp
		return amount;
	}
}