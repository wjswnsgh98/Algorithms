import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=i+1;
		}
		for(int i=1; i<=m; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int temp = arr[N-1];
			arr[N-1] = arr[M-1];
			arr[M-1] = temp;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}