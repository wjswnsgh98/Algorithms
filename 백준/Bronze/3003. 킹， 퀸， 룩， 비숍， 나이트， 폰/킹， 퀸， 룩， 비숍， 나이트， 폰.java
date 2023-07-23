import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 1, 2, 2, 2, 8};
		int[] arr1 = new int[6];
		for(int i=0; i<6; i++) {
			arr1[i] = sc.nextInt();
			if(arr[i]-arr1[i]<0 || arr[i]-arr1[i]>0) {
				arr1[i] = arr[i] - arr1[i];
			}
			else {
				arr1[i]=0;
			}
			System.out.print(arr1[i]+" ");
		}
	}
}