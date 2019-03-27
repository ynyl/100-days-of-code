import java.util.Scanner;
/**
 *
 * @author 
 */
public class Fibonacci {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
            Scanner fib = new Scanner(System.in);
            System.out.println("How many terms?");
            int terms = fib.nextInt();
            if (terms <= 0) {
                System.out.println("Please enter a positive integer");
            } else if (terms == 1) {
                System.out.println("Fibonacci sequence up to" + terms + " : ");
                System.out.println(terms);
            } else {
                System.out.println("Fibonacci sequence up to" + terms + " : ");
                int n1 = 0;
                int n2 = 1;
                int count = 0;
                while (count < terms) {
                    System.out.println(n1);
                    int nth = n1 + n2;
                    n1 = n2;
                    n2 = nth;
                    count++;
                }
            }
        }
}
