package app;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String userGuess;
		int rounds = 0;
		String correctName = "Emma";
		String firstLetter = correctName.substring(0, 1);
		String secondLetter = correctName.substring(1, 2);
		String thirdLetter = correctName.substring(2, 3);

		do
		{

			System.out.println("Guess my name (type stop to exit)");
			userGuess = in.nextLine();
			rounds = rounds + 1;
			if (userGuess.equals(correctName))
			{
				System.out.println("Congratulations!");
				System.out.printf("You guessed %d times.", rounds);
				break;
			}
			else if(userGuess.equals("stop")){
				break;
			}
			else if(!userGuess.equals(correctName) && rounds == 1){
				System.out.printf("A hint: The first letter of the correct name is %s%n", firstLetter);

			}else if(!userGuess.equals(correctName) && rounds == 2){
				System.out.printf("Second hint: The second letter of the correct name is %s%n", secondLetter);

			}else if (!userGuess.equals(correctName) && rounds == 3){
				System.out.printf("Third hint: The third letter of the correct name is %s%n", thirdLetter);
			}else {
				System.out.println("The correct answer is Emma!");
				System.out.printf("You guessed %d times.", rounds);
			}		
		}
		while(userGuess.equals("stop") || rounds < 4);
	}

}
