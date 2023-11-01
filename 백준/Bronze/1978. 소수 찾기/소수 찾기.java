import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }


    int count = 0;
    for(int i = 0; i < arr.length; i++) {

      int cnt = 0;
      for(int j = 1; j <= arr[i]; j++) {
        if(arr[i] % j == 0) {
          cnt++;
        } else if(arr[i] == 1){
          continue;
        }
      }

      if(cnt == 2) {
        count++;
      }
    }

    System.out.println(count);
  }
}