import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		System.out.println(a > b ? a : b);
	}
}
// StringBuider : 문자열을 다루는 클래스, append() 넣어진 값은 StringBuilder라는 타입으로 변경
// reverse()라는 메소드를 통해 저장되어있던 문자열을 뒤집는다
// StringBuilder라는 타입을 문자열로 반환하기 위해 toString() 씀
// 문자열로 반환하니 Integer.parseInt()로 String을 int 타입으로 변경