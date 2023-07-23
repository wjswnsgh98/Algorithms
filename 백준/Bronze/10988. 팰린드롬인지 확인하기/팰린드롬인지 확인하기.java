import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int mid = str.length()/2;
		int ans = 1;
		for(int i=0; i<mid; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				ans=0;
			}
		}
		System.out.println(ans);
	}
}