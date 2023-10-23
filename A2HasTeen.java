/**
 * Does User Have a Teen
 * @author: Rachael Chan
 */

 public class A2HasTeen extends ConsoleProgram {

    public void run() {

        //Ask User for Teen Ages
        int intAge1 = readInt("First Age? ");
        int intAge2 = readInt("Second Age? ");
        int intAge3 = readInt ("Third Age? ");

        System.out.println(intAge1);
        System.out.println(intAge2);
        System.out.println(intAge3);

        // Determine if the Ages are Teen
        boolean blnAge1 = intAge1 >= 13 && intAge1 <= 19;
        boolean blnAge2 = intAge2 >= 13 && intAge2 <= 19;
        boolean blnAge3 = intAge3 >= 13 && intAge3 <= 19;

        if((blnAge1 || blnAge2 || blnAge3) == true ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
 }
