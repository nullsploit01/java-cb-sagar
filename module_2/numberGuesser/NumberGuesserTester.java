package module_2.numberGuesser;

import java.util.Scanner;

public class NumberGuesserTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Number Guesser!");
        System.out.println("Enter the number of guesses: ");
        var numberOfGuesses = scanner.nextInt();
        scanner.nextLine();

        NumberGuesser numberGuesser = new NumberGuesser();
        var randomGeneratedNumber = numberGuesser.generateARandomNumber();
        var previousDifference = Integer.MAX_VALUE;

        for(var i = 0; i < numberOfGuesses; i += 1) {
            System.out.println("Guess a number between 1 and 50: ");
            var userGuess = scanner.nextInt();
            scanner.nextLine();

            if (numberGuesser.guessNumber(userGuess)) {
                System.out.println("You win! You guessed the correct number");
                break;
            }

            var currentDifference = Math.abs(userGuess - randomGeneratedNumber);
            if(currentDifference < previousDifference && previousDifference != Integer.MAX_VALUE) {
                System.out.println("You are getting close!");
            }else if (currentDifference > previousDifference && previousDifference != Integer.MAX_VALUE) {
                System.out.println("You are getting farther away!");
            }else {
                System.out.println("Nope! Try again.");
            }

            previousDifference = currentDifference;
        }

        System.out.println("You Lose! Answer was " + randomGeneratedNumber);
        scanner.close();
    }
}

// Add a validation that user input is between 1 - 50;
// Ask user if they want hints, if they don't, do not show if they are farther or closer