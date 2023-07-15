import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String w = sc.next();
		int sum=0;
		for(int i=0; i<n;i++) {
			sum += w.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
// charAt()은 해당 문자의 아스키코드 값을 반환하기 때문에 -48 또는 '0'을 해줘야함.