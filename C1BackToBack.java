public class C1BackToBack extends ConsoleProgram {
    /**
     * Back To Back
     * @author: Rachael Chan
     */

    public void run() {
        String strUserString = readLine("Enter a Word: ");

        int intUserString = strUserString.length();
        char chrLastCharacter = strUserString.charAt(intUserString-1);
        System.out.println(chrLastCharacter + strUserString + chrLastCharacter);
    }
}
