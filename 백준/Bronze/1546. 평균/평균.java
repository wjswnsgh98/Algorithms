import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] arr = new float[n];
		float max=0;
		float sum=0;
		float avg=0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextFloat();
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]/max*100;
			sum += arr[i];
			avg = sum/n;
		}
		System.out.println(avg);
	}
}