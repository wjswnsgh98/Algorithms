import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int cnt = 0;
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int a = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(a==arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}