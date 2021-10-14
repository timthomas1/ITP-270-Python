import java.util.Scanner;

import java.text.NumberFormat;

public class billsReconcile {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double timPay;
		double yosPay;
		double monthlyTotal;
		double equalPay;
		double timShare;
		double yosShare;
		
		System.out.print("How much did Tim pay? $");
		timPay = input.nextDouble();
		
		System.out.print("How much did Yosmary pay? $");
		yosPay = input.nextDouble();
		
		monthlyTotal = timPay + yosPay;
		
		equalPay = monthlyTotal / 2;
		
		timShare = timPay - equalPay;
		yosShare = yosPay - equalPay;

		if (timPay > yosPay) {
			System.out.println("Yosmary owes Tim " + money.format(timShare));
		}
		
		else if (timPay < yosPay) {
			System.out.println("Tim owes Yosmary " + money.format(yosShare));
		}		
	}	
}