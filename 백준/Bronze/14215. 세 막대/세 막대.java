import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int[] arr = {a, b, c};

    Arrays.sort(arr);

    if(arr[2] < arr[0] + arr[1]) {
      System.out.println(a + b + c);
    } else {
      System.out.println((arr[0] + arr[1]) * 2 - 1);
    }
  }
}