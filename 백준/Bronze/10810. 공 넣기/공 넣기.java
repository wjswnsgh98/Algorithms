import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<m; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int k = sc.nextInt();
			for(int j=N-1; j<M; j++) {
				arr[j]=k;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}