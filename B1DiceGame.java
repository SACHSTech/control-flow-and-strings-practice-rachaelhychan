import java.util.Random;

 public class B1DiceGame extends ConsoleProgram {

    /**
    * 100 Dice Rolls 
    * @author: Rachael Chan
    */

    public void run() {

        // Create Random Object
        Random randomNum = new Random();

        int intCounter = 0;

        // Roll Dice
        while(intCounter < 100){

            int intRandom1 = randomNum.nextInt((6 - 1) + 1) + 1;
            int intRandom2 = randomNum.nextInt((6 - 1) + 1) + 1;
            
            // Determine if the Dice Rolls add up to 2 or 7
            if((intRandom1 + intRandom2) == 2){
                System.out.println("snake eyes!");
            }else if((intRandom1 + intRandom2) == 7){
                System.out.println("lucky seven");
            }else if((intRandom1 + intRandom2) != 2 && (intRandom1 + intRandom2) != 7) {
            }

            intCounter++;
        }
    }
 }
