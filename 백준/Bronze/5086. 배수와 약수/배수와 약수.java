import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a < b) {
        if(b % a == 0) {
          System.out.println("factor");
        } else {
          System.out.println("neither");
        }
      } else if(a > b) {
        if(a % b == 0) {
          System.out.println("multiple");
        } else {
          System.out.println("neither");
        }
      } else {
        System.out.println();
        break;
      }
    }
  }
}