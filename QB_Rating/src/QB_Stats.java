import java.util.Scanner;

public class QB_Stats {

	public static void main(String[] args) {
			//creates scanner
			java.util.Scanner input = new Scanner(System.in);

			System.out.println("Welcome to the QB Rater! Follow the prompt and it will display the QB rating based on their stats.");
			System.out.println("");
			
		
			System.out.println("How many passing yards did the QB accumulate?");
			double Yards = input.nextDouble();
			
			System.out.println("How many passing attempts the the QB have?");
			double ATT = input.nextDouble();
			
			System.out.println("How many passing completions did the QB have?");
			double Comp = input.nextDouble();
			
			System.out.println("How many interceptions did the QB have?");
			double INT = input.nextDouble();
			
			//Prompts user to input required monthly income and assigns variable
			System.out.println("How many passing touchdowns did the QB have?");
			double TD = input.nextDouble();
			
			double a = ((Comp / ATT) - 0.3) * 5;
			double b = ((Yards/ATT) - 3) * 0.25;
			double c = (TD / ATT) * 20;
			double d = 2.375 - ((INT / ATT) * 25);
			
			double passer_rating = ((a + b + c + d) / 6) * 100;
			System.out.println("QB Rating:");
			System.out.printf("%2.1f" ,passer_rating);
					
	}

}
