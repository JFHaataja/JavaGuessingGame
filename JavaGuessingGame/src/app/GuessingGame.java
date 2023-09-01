package app;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String userGuess;
		int rounds = 0;
		
		do
		{
			System.out.println("Guess my name (type stop to exit)");
			userGuess = in.nextLine();
			rounds = rounds + 1;
			if(userGuess.equals("Emma")) {
				System.out.println("Congratulations!");
				System.out.printf("You guessed %d times.", rounds);
			}
			if(userGuess.equals("stop")) {
				System.out.printf("You guessed %d times.", rounds-1);
				break;
			}
			
		}
		while(!userGuess.equals("Emma"));
	}

}
