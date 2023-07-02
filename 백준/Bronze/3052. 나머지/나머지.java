import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for(int i=0; i<arr.length; i++) {
			int cnt1=0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					cnt1++;
				}
			}
			if(cnt1==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}