import java.util.Scanner;

public class bmiCalc {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Welcome to the BMI Calculator!");
		System.out.println();
		
		System.out.print("Please enter your weight in pounds: ");
		int weight = scan.nextInt();
	
		System.out.print("Please enter your height in inches: ");
		int height = scan.nextInt();
		
		double bmi = (weight * 703) / (height * height);
		System.out.println("Your BMI is: " + bmi);
		
		if (bmi < 18.5)
			System.out.println("You are Underweight");
		else if (bmi >= 18.5 && bmi <24.9)
			System.out.println("You are Normal");
		else if (bmi >= 25 && bmi <29.9)
			System.out.println("You are Overweight");
		else if (bmi >= 30)
			System.out.println("You are Obese");
		
		System.out.println();
		System.out.println("Acceptable Ranges");
		System.out.println("BMI VALUES");
		System.out.println("Underweight: Less than 18.5");
		System.out.println("Normal: Between 18.5 and 24.9");
		System.out.println("Overweight: Between 25 and 29.9");
		System.out.println("Obese: 30 or Greater");
	}
}