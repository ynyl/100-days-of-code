//program that converts seconds to hour, minute, and seconds

import java.util.Scanner;

public class SecConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sec = sc.nextInt();
    System.out.println("Input seconds: " + sec);
    int hour = sec / 3600;
    int secMinusHour = sec % 3600;
    int min = secMinusHour / 60;
    int secMinusMin = secMinusHour % 60;
    System.out.println(hour + ":" + min + ":" + secMinusMin);
  }
}
