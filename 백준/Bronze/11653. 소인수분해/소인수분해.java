import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    while(num != 1) {
      for(int i = 1; i <= num; i++) {
        if(num % i == 0) {
          if(i != 1) {
            num /= i;
            System.out.println(i);
            break;
          }
        } else {
          continue;
        }
      }
    }

  }
}