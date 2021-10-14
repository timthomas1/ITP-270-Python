import java.util.Scanner;

import java.text.NumberFormat;

import java.text.SimpleDateFormat; 

import java.util.Date;    

public class travelPlanner {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double grandTotal = 0;
		double grandTotal1 = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY HH:mm"); 
		Date todaysDate = new Date();
		System.out.println("What is today's date and time?");
		System.out.println(sdf.format(todaysDate));
		System.out.println();

		System.out.println("Where are you be headed?");
		String location = scan.nextLine();
		System.out.println(location + " is a great place to visit!");
		System.out.println();

		System.out.println("How many days will you be staying there?");
		int days = scan.nextInt();
		System.out.println();
		
		System.out.println("Will you be flying or driving?");
		scan.nextLine();
		String flyorDrive = scan.nextLine();
		System.out.println();
		if (flyorDrive.contains("ly")) {
			System.out.println("How much did the flight cost?");
			double flightCost = scan.nextDouble();
			System.out.println();
			grandTotal = flightCost;
		}
		
		else {
			System.out.println("How much do you expect to spend in gas (roundtrip)?");
			double gasCost = scan.nextDouble();
			System.out.println();
			grandTotal = gasCost;

		}
		
		//double flightCost;
		//double gasCost;
		
		System.out.println("How much will lodging cost in total?");
		double lodgingCost = scan.nextDouble();
		System.out.println();
		/*System.out.println("How much did taxes cost?");
		double lodgingTax = scan.nextDouble();
		System.out.println("The toal cost of lodging is: " + money.format(lodgingCost + lodgingTax)); */
		
		System.out.println("Will you be renting a car? (Yes/No)");
		scan.nextLine();
		String carRental = scan.nextLine();
		if (carRental.contains("es")) {
			System.out.println("How much did the rental car cost?");
			double carCost = scan.nextDouble();
			System.out.println();
			grandTotal1 = carCost;
		}
		
		else {
			System.out.println();
			//System.out.println();

		}
	
		System.out.println("The grand total for your trip is: " + money.format(lodgingCost + grandTotal1 + grandTotal));
		System.out.println();

		System.out.println("Will you be splitting this trip? (Yes/No)");
		scan.nextLine();
		String split = scan.nextLine();
		System.out.println();
		if (split.contains("No")) {
			System.out.println();
		}
		
		else {
			System.out.println("How many people will be splitting the trip?");
			double people = scan.nextInt();
			System.out.println();
			System.out.println("Each person should pay " + money.format((lodgingCost + grandTotal1 + grandTotal) / (people)));

		}
	}
}