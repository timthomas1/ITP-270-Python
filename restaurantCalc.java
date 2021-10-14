import java.text.NumberFormat;

import java.util.Scanner;

public class restaurantCalc {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double mealPrice;
		double Tax = .0675;
		double addTax;
		double Tip = .15;
		double addTip;
		double totalBill;
		
		System.out.print("Meal Charge: $");
		mealPrice = input.nextDouble();
		
		addTax = ((double)mealPrice) * Tax;
		System.out.println("Tax Amount: " + money.format(addTax));
		
		addTip = (mealPrice + addTax) * Tip;
		System.out.println("Tip Amount: " + money.format(addTip));
		
		totalBill = mealPrice + addTax + addTip;
		System.out.println("Total Bill: " + money.format(totalBill));

	}
}