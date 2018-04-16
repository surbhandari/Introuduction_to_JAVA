import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
        System.out.println("I have a secret number can you guess  guess, one digit(0-9) at a time\n____________________\n ");
        //Step #1: Generate a random number that is between 10 and 20 digits long
        long randomNumber = (long)(1E9 + Math.random() * (long)9.9999999999E19);
        String gameNumber = randomNumber + "";

        //Step #2: Convert each digit of the randomly generated number to an element in an array
        int[] digits = new int[gameNumber.length()];
        for (int i = 0; i < gameNumber.length(); i++) {
            digits[i] = Integer.parseInt(gameNumber.substring(i, i + 1));
        }

        //Step #3: Print out as many x's as there are digits
        for (int i = 0; i < gameNumber.length(); i++) {
            System.out.print("x");
        }

        //Step #4: Count the number of distinct digits, which will then become the number of guesses that the user is allowed to make
        boolean isDistinct = true;
        int countDistinctDigits = 0;
        for (int i = 0; i < gameNumber.length(); i++) {
            isDistinct = true;
            for (int j = i; j >= 0; j--)
                if (digits[i] == digits[j] && i != j)
                    isDistinct = false;
            if (isDistinct)
                countDistinctDigits++;
        }

        //Step #5: Ask the user to guess a digit and search the "digits" array for a match
        //Store each correct guess into the "guesses" array
        //Take into account that the default values of an array of integers is 0
        Scanner input = new Scanner(System.in);
        int[] guesses = new int[gameNumber.length()];
        int guess = -1;
        boolean zeroIsGuessed = false;
        for (int numberOfGuesses = 0; numberOfGuesses < countDistinctDigits; numberOfGuesses++) {
            System.out.print("\n\nGuess a digit: ");
            guess = input.nextInt();
            if (guess == 0)
                zeroIsGuessed = true;
            for (int i = 0; i < gameNumber.length(); i++) {
                if (digits[i] == guess)
                    guesses[i] = digits[i];
                if (zeroIsGuessed) {
                    if (digits[i] == guesses[i])
                        System.out.print(guesses[i]);
                    else
                        System.out.print("x");
                } else {
                    if (digits[i] == guesses[i] && guesses[i] != 0)
                        System.out.print(guesses[i]);
                    else
                        System.out.print("x");
                }
            }
        }

        //Step #6: Determine whether or not the user won by comparing the user's guesses to the actual digits in the number
        boolean win = true;
        if (zeroIsGuessed) {
            for (int i = 0; i < gameNumber.length(); i++) {
                if (digits[i] != guesses[i])
                    win = false;
            }
        } else {
            for (int i = 0; i < gameNumber.length(); i++) {
                if (digits[i] != guesses[i] || guesses[i] == 0)
                    win = false;
            }
        }

        //Step #7: Print whether the user won or lost
        if (win)
            System.out.println("\n\nYou Win!\n");
        else
            System.out.print("\n\nYou Lose!\n");
        System.out.print("The number was ");
        for (int i = 0; i < gameNumber.length(); i++) {
            System.out.print(digits[i]);
        }

}
}
