

public class Calculator {

	public static float Debt;
	public float Income;
	public float Interest;
	

	public float getDebt() {
		return Debt;
	}
	public float setDebt(float Monthly_Debt) {
		Debt=(float) (Monthly_Debt*.03);
		return Debt;
	}
	
	public double house_debt(float Gross_Income){
		return ((Gross_Income/12)*.18);
	}
	public double all_debt(float Gross_Income){
		return ((Gross_Income/12)*18-Debt);
	}
	
	public int numberOfPayment(int Terms){
		return Terms*12;
	}
	
	public static double bigger(float Gross_Income){
		double house_d= ((Gross_Income/12)*.18);
		double total_d = ((Gross_Income/12)*18-Debt);
		
		if(house_d<total_d){
			return house_d;
		}
		else{
			return total_d;
		}
		
	}
}
