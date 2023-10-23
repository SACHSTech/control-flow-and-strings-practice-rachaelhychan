public class C2EveryNth extends ConsoleProgram {
    /**
     * Every Nth
     * @author: Rachael Chan
     */

     public void run() {
        String strUserString = readLine("Enter a String: ");
        int intN = readInt("Enter N: ");

        int intCounter = 0;

        while(intCounter <= strUserString.length()){
            char chrUserString = strUserString.charAt(intCounter);
            System.out.print(chrUserString);
            intCounter = intCounter + intN;
        }

        
     }
}
