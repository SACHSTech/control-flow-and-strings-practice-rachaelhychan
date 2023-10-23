/** 
 * This Program Tells You if One Temperature is less than 100 and the other is over 100
 * @author: Rachael Chan 
 */

 public class A1FreezingHot extends ConsoleProgram {

    public void run() {

        // Ask User Input
        int intTemp1 = readInt("Enter First Temperature: ");
        int intTemp2 = readInt("Enter Second Temperature: ");

        // If One number is greater than 100, and the other is less than 100, true will be outputted. Else, false will be outputted.
        if((intTemp1 < 100) && (intTemp2 > 100)){
            System.out.println(intTemp1);
            System.out.println(intTemp2);
            System.out.println("true");
        }else if((intTemp1 > 100) && (intTemp2 < 100)){
            System.out.println(intTemp1);
            System.out.println(intTemp2);
            System.out.println("true");
        }else{
            System.out.println(intTemp1);
            System.out.println(intTemp2);
            System.out.println("false");
        }

    }
 }