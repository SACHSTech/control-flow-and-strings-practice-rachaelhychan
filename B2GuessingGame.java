import java.util.Random;

public class B2GuessingGame extends ConsoleProgram {
    /**
    * Guessing Game
    * @author: Rachael Chan
    */

    public void run() {

        //Create Random Object
        Random RandomNum = new Random();

        // Generate Random Number
        int intRandom = RandomNum.nextInt((100 - 1 + 1)- 1);

        // Compare Guess to Random Number
        int intCounter = 0;

        while(intCounter < 5){
            int intGuess = readInt("Guess a Number Between 1-100: ");
            if(intRandom > intGuess){
                System.out.println("too low, guess again");
            }else if(intRandom < intGuess){
                System.out.println("too high, guess again");
            }else if(intRandom == intGuess){
                System.out.println("congratulations");
                break;
            }
            intCounter++;
        }

        if(intCounter == 5){
            System.out.println("Nice Try");
        }

    }
}

