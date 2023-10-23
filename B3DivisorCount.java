public class B3DivisorCount extends ConsoleProgram {

    /**
     * Divisor Count
     * @author: Rachael Chan
     */

     public void run(){
        // Ask User for their Number
        int intUserNum = readInt("Enter a Number: ");
        int intCounter = intUserNum;

        // Calculate the Divisors
        while(intCounter > 0){
            if (intUserNum % intCounter == 0){
                System.out.println(intCounter);
            }
            intCounter--;
        }
     }
}
