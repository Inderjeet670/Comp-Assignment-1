/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package canadian.payroll;

public class HealthPremium extends Deduction {
	
	public HealthPremium( Employee employee ) {
		super( employee );
	}
	
	public double computeAmount() {
		
		double income = employee.getIncome();
		//INSERT YOUR CODE HERE - Using the specification given on HealthPremium
		double healthPremium = 0;

		if(income <= 22000){
			healthPremium = 0;
		}
		else if(income > 22000 && income <= 38000){
			if( 22000 * 0.06 > 300){
				healthPremium = 300;
			}
			else{
				healthPremium = income * 0.06;
			}
		}
		else if(income > 38000 && income <= 50000){
			if( ((38000 * 0.06) + 300) > 450){
				healthPremium = 450;
			}
			else{
				healthPremium = ((38000 * 0.06) + 300);
			}
		}
		else if(income > 50000 && income <= 74000){
			if(((50000 * 0.25) + 450) > 600){

				healthPremium = 600;
			}
			else{
				healthPremium = (50000 * 0.25) + 450;
			}
		}
		else if(income > 74000 && income <= 202000){
			if((74000 * 0.25) + 600 > 750){
				healthPremium = 750;
			}
			else{
				healthPremium = (74000 * 0.25) + 600;
			}
		}
		else if(income > 202000){
			if((202000 * 0.25) + 750 > 900){
				healthPremium = 900;
			}
			else{
				healthPremium = ((202000 * 0.25) + 750);
			}
		}
		return healthPremium;
	}
	
	public double getAmount() {
		amount = computeAmount(); //computes the applicable CPP
		amount = Math.round( amount * 100.0 ) / 100.0; //rounding off to 2dp
		return amount;
	}
}