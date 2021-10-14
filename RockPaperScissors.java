import java.util.Scanner;

public class RockPaperScissors {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userChoice = "";
		String computerChoice = "";
		int userWin = 0;
		int computerWin = 0;

		for (int counter = 1; counter <= 5; counter++) {
			
			System.out.println("What's your play? (Rock/Paper/Scissors): ");
			userChoice = input.nextLine();

			int guess = (int) (Math.random() * 3) + 1;

			if (guess == 1)
				computerChoice = "Rock";
			else if (guess == 2)
				computerChoice = "Paper";
			else if (guess == 3)
				computerChoice = "Scissors";

			System.out.println("Computer's play: ");
			System.out.println(computerChoice);
			System.out.println();

			if (userChoice.equals("Rock")) {
				if (computerChoice.equals("Scissors")) {
					System.out.println("Rock smashes Scissors, Rock Wins!");
					System.out.println("The User wins!");
					System.out.println();
					userWin++;
				}
				else if (computerChoice.equals("Paper")) {
					System.out.println("Paper wraps Rock, Paper Wins!");
					System.out.println("The Computer wins!");
					System.out.println();
					computerWin++;
				}
				else if (computerChoice.equals("Rock"))
					System.out.println("It's a Tie!");
					System.out.println();
			}

			else if (userChoice.equals("Paper")) {
				if (computerChoice.equals("Scissors")) {
					System.out.println("Scissors cuts Paper, Scissors Wins!");
					System.out.println("The Computer wins!");
					System.out.println();
					computerWin++;
				}
				else if (computerChoice.equals("Rock")) {
					System.out.println("Paper wraps Rock, Paper Wins!");
					System.out.println("The User wins!");
					System.out.println();
					userWin++;
				}
				else if (computerChoice.equals("Paper"))
					System.out.println("It's a Tie!");
					System.out.println();
			}

			else if (userChoice.equals("Scissors")) {
				if (computerChoice.equals("Paper")) {
					System.out.println("Scissors cuts Paper, Scissors Wins!");
					System.out.println("The User wins!");
					System.out.println();
					userWin++;
				}
				else if (computerChoice.equals("Rock")) {
					System.out.println("Rock smashes Scissors, Rock Wins!");
					System.out.println("The Computer wins!");
					System.out.println();
					computerWin++;
				}
				else if (computerChoice.equals("Scissors"))
					System.out.println("It's a Tie!");
					System.out.println();
			}
		}
		//insert for loop above these lines
		System.out.println("The User won " + userWin + " times and the Computer won " + computerWin + " times.");

		if (computerWin > userWin)
			System.out.println("The Grand Winner is the Computer!");

		else if (computerWin < userWin)
			System.out.println("The Grand Winner is the User!");
		
		else if (computerWin == userWin)
			System.out.println("It's a Tie! The User and Computer had " + computerWin + " wins.");
	}

}