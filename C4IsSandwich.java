public class C4IsSandwich extends ConsoleProgram {
    /**
     * What is Sandwiched between Two Bread
     * @author: Rachael Chan
     */

     public void run() {
        String strUserSandwich = readLine("Enter a Sandwich: ");
        int intUserBread1 = strUserSandwich.indexOf("bread");
        int intUserBread2 = strUserSandwich.indexOf("bread", intUserBread1 + 5);

        if (intUserBread1 >= 0 && intUserBread2 >= 0){
            int intBetween = intUserBread2 - intUserBread1 - 5;
            String strBetween = strUserSandwich.substring(intUserBread1 + 5, intUserBread1 + 5 + intBetween);
            System.out.println(strBetween);
        }else{
            System.out.println(" ");
        }
     }
}
