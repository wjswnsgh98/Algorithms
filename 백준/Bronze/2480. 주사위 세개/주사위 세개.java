import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max=0;
		if(a!=b && b!=c && c!=a) {
			if(a>b) {
				if(a>c) {
					max=a;
				}
			}
			if(b>a) {
				if(b>c) {
					max=b;
				}
			}
			if(c>a) {
				if(c>b) {
					max=c;
				}
			}
			System.out.println(max*100);
		}
		else {
			if(a==b && b==c && c==a) {
				max=a;
				System.out.println(10000+a*1000);
			}
			else {
				if(a==b || a==c){
					System.out.println(1000+a*100);
				}
				else {
					System.out.println(1000+b*100);
				}
			}
		}
	}
}