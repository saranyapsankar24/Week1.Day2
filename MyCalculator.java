package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int add = calc.add(10, 78, 35);
		System.out.println("The sum is " + add);
		
		int sub = calc.sub(28, 14);
		System.out.println("The difference is "+ sub);
		
		double mul= calc.mul(9876, 1589);
		System.out.println("The multiplication result is " + mul);
		
		float div=calc.divide(10, 5);
		System.out.println("Quotient is " + div);
		
				
	}

}
