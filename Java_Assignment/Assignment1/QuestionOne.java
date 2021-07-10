class BillCalculator{
	
	float stdPricePerUnit = 1.20f;
	float price = 0.0f;
	
	public float cal(float units) {
		if (units < 100) {
			price = stdPricePerUnit * units;
		}
		else if (units <= 300) {
			price = (stdPricePerUnit * 100) + (2 * (units - 100));
		}
		else {
			
			price = (stdPricePerUnit * 100) + (2 * (units - 100)) + (3 * (units - 200));
		}
		
		return Math.round(price);
		
	}
}


public class QuestionOne {
	public static void main(String args[]) {

		BillCalculator b = new BillCalculator();
		System.out.println(b.cal(300f));
	}
}
