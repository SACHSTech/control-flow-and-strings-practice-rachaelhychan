public class A3Within10 extends ConsoleProgram {
    /**
    * Which Number is Closer to 10
    * @author: Rachael Chan
    */
    
    public void run(){

        // Ask for User to Input 2 numbers
        int intNumber1 = readInt("First Number? ");
        int intNumber2 = readInt("Second Number? ");

        System.out.println(intNumber1);
        System.out.println(intNumber2);

        int intDifference1 = 10 - intNumber1;
        int intDifference2 = 10 - intNumber2;

        //Compare two numbers
        if(intDifference1 > intDifference2){
            System.out.println(intNumber2);
        }else if(intDifference2 > intDifference1){
            System.out.println(intNumber1);
        }else if(intDifference1 == intDifference2){
            System.out.println(0);
        }
    }
 }