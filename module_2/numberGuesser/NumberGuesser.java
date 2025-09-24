package module_2.numberGuesser;

import java.util.Random;

public class NumberGuesser {
    int randomGeneratedNumber;

    public NumberGuesser() {

    }

    public int generateARandomNumber() {
        Random rand = new Random();
        var randomNumber = rand.nextInt(1, 51); // 1 - 50
        randomGeneratedNumber = randomNumber;
        return randomNumber;
    }

    public boolean guessNumber(int guessedNumber) {
        var isCorrect =  guessedNumber == randomGeneratedNumber;

        return isCorrect;
    }
}
