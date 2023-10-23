public class D1GramsToPounds extends ConsoleProgram {

    /**
     * Grams To Pounds
     * @author: Rachael Chan
     */

     public void run() {

        System.out.printf(" Grams     Pounds%n");
        System.out.printf("--------------------%n");

        int intGrams = 100;

        while(intGrams < 1000){
            double dblPounds = intGrams * 0.00220462;
            System.out.printf("%6d %10.4f %n", intGrams, dblPounds);
            intGrams += 100;
        }
     }
}
