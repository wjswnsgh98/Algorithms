import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int B = sc.nextInt();

    String number = Integer.toString(num, B);
    String number1 = number.toUpperCase();
    System.out.println(number1);
  }
}