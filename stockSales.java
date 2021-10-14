import java.util.Scanner;

public class stockSales {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		Scanner input = new Scanner( System.in );
		String stock;
		int buyCostPerShare;
		int sharesPurchased;
		double commissionRate;
		int saleCostPerShare;
		int totalPaid;
		
		System.out.println("What is the name of the stock?");
		stock = scan.nextLine();
		
		System.out.println("What is the purchase cost per share?");
		buyCostPerShare = input.nextInt();
		
		System.out.println("How many shares were purchased?");
		sharesPurchased = input.nextInt();
		
		System.out.println("What is the commission rate in percentage?");
		commissionRate = input.nextInt()*.01;

		System.out.println("What was the sales cost per share?");
		saleCostPerShare = input.nextInt();
		
		totalPaid = buyCostPerShare * sharesPurchased;
		
		System.out.println("Amount paid for " + stock + ": $" + totalPaid);
		
		double purchaseCommission;
		purchaseCommission = totalPaid*commissionRate;
		System.out.println("Purchase Commission: $" + purchaseCommission);
		
		double totalWithCommission;
		totalWithCommission = totalPaid + purchaseCommission;
		System.out.println("Total w/ Commission: $" + totalWithCommission);
		
		double stockWhenSold;
		stockWhenSold = saleCostPerShare*sharesPurchased;
		System.out.println("Value of Stock When Sold: $" + stockWhenSold);
		
		double saleWithCommission;
		saleWithCommission = stockWhenSold * commissionRate;
		System.out.println("Sales Commission: $" + saleWithCommission);
		
		double profit;
		profit = stockWhenSold - purchaseCommission - saleWithCommission - totalPaid;
		System.out.println("You Made: $" + profit);

	}
}