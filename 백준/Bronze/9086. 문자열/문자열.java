import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()<1) {
				System.out.println(arr[i]+""+arr[i]);
			}
			else { // substring 문자열을 나눠주는 메서드
				System.out.print(arr[i].substring(0,1)); // index 0번째 출력
				System.out.println((arr[i].substring(arr[i].length()-1, arr[i].length()))); // 마지막 index 출력
			}
		}
	}
}

// substring(0,1) 0: 시작번호 1: 끝번호 => 인덱스 0번째부터 1번전까지라는 의미