//program that generates mean from a list of int

import java.util.Scanner;
/**
 *
 * @author
 */
public class MeanScan {
    public static void main(String[] args) {
    Scanner list = new Scanner(System.in);
    
    int sum = 0;
    int count = 0;
    
    while (list.hasNextInt()) {
      int a = list.nextInt();
      
      sum += a;
      count++;
    }
    
    int mean = sum / count;
    
    System.out.println("Mean: " + mean);
  }
}
