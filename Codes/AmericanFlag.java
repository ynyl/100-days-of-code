public class AmericanFlag {
  public static void main(String[] args) {
    String a = "* * * * * * ==================================\n * * * * *  ==================================";
    String a1 = "* * * * * * ==================================";
    String b = "==============================================";
    
    for (int i = 0; i < 4; i++) {
      System.out.println(a);
    }
    System.out.println(a1);
    
    for (int i = 0; i < 6; i++) {
      System.out.println(b);
    }
  }
}
