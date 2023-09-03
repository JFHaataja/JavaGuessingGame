package app;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String userGuess;
		int rounds = 0;

		String correctName = "EMMA";
		String firstLetter = correctName.substring(0, 1);
		String secondLetter = correctName.substring(1, 2);
		String thirdLetter = correctName.substring(2, 3);

		String gameInstructionsMsg = "Guess my name (type stop to exit)";
		String numberOfGuessesMsg = "You guessed %d times.";

		String firstHintMsg = "A hint: My name's first letter is %s%n";
		String secondHintMsg = "Second hint: My name's second letter is %s%n";
		String thirdHintMsg = "Third hint: My name's third letter is %s%n";

		String noRightAnswerMsg = "Sorry, you didn't guess my name! The correct answer is %s!%n";
		String rightAnswerMsg = "Congratulations! You guessed right!";

		do
		{
			System.out.println(gameInstructionsMsg);
			userGuess = in.nextLine().toLowerCase();
			rounds = rounds + 1;
			if (userGuess.equals(correctName.toLowerCase()))
			{
				System.out.println(rightAnswerMsg);
				System.out.printf(numberOfGuessesMsg, rounds);
				break;
			}
			else if(userGuess.equals("stop"))
			{
				System.out.printf(numberOfGuessesMsg, rounds-1);
				break;
			}
			else if(!userGuess.equals(correctName) && rounds == 1)
			{
				System.out.printf(firstHintMsg, firstLetter);

			}else if(!userGuess.equals(correctName) && rounds == 2)
			{
				System.out.printf(secondHintMsg, secondLetter);

			}else if (!userGuess.equals(correctName) && rounds == 3)
			{
				System.out.printf(thirdHintMsg, thirdLetter);
			}
			else {
				System.out.printf(noRightAnswerMsg, correctName);
				System.out.printf(numberOfGuessesMsg, rounds);
			}		
		}
		while(userGuess.equals("stop") || rounds < 4);
	}

}
