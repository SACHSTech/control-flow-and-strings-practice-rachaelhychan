public class B4IsPrime extends ConsoleProgram {
    
    /**
     * Is the Number Prime?
     * @author: Rachael Chan
     */

     public void run() {
        int intUserNum = readInt("Enter a Number: ");
        int factorNum = 0;
        int intCounter = intUserNum - 1;

        while(intCounter > 1){
            if(intUserNum % intCounter == 0){
                factorNum ++;
            }
            intCounter --;
        }

        if(factorNum == 0){
            System.out.println(intUserNum + " is a prime number");
        }else{
            System.out.println(intUserNum + " is a composite number");
        }
        

     }

}
