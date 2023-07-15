import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int n = sc.nextInt();
		char[] sarr = word.toCharArray();
		System.out.println(sarr[n-1]);
	}
}