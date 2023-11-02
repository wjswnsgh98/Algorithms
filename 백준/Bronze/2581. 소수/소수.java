import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = 0;
    List<Integer> list = new ArrayList<>();
    for(int i = a; i <= b; i++) {

      int cnt = 0;
      for(int j = 1; j <= i; j++) {
        if(i % j == 0) {
          cnt++;
        } else if(i == 1){
          continue;
        }
      }

      if(cnt == 2) {
        list.add(i);
        sum += i;
      }

    }

    if(list.size() == 0) {
      System.out.println(-1);
    } else {
      System.out.println(sum);
      System.out.println(list.get(0));
    }
  }
}