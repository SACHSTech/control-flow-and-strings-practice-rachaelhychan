public class C3MiddleAbc extends ConsoleProgram {
    /**
     * Does a String Have ABC in the Middle?
     * @author: Rachael Chan
     */
    
     public void run() {
        String strUserString = readLine("Enter a String: ");
        int intStringLength = strUserString.length();
        int intMiddleAbc = strUserString.indexOf("abc");
        String strBeforeAbc = strUserString.substring(0, intMiddleAbc);
        String strAfterAbc = strUserString.substring(intMiddleAbc + 3, intStringLength);
        int intBeforeAbc = strBeforeAbc.length();
        int intAfterAbc = strAfterAbc.length();

        if (Math.abs(intBeforeAbc - intAfterAbc) > 1){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
     }

}
