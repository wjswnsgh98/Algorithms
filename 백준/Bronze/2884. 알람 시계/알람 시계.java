import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m < 45) {
			if (h==0) {
				h=24;
			}
			h = h-1;
			m = m+15;
			System.out.printf("%d %d",h,m);
		}
		else {
			System.out.println(h + " " + (m-45));
		}
	}
}