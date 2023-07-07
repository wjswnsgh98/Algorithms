import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int[][] arr = new int[10][10];
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int a = 0;
    int b = 0;
    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9; j++) {
        arr[i][j] += sc.nextInt();
      }
    }

    for(int i = 0; i < 9; i++) {
      for(int j = 0; j < 9; j++) {
        if(arr[i][j] > max) {
          max = arr[i][j];
          a = i;
          b = j;
        }
      }
    }
    System.out.println(max);
    System.out.println((a+1) + " " + (b+1));
  }
}