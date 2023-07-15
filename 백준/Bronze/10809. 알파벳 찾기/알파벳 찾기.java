import java.util.* ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		// a부터z까지 알파벳 갯수가 26개이므로 원소개수 26개인 배열 생성 후 -1로 초기화
		String w = sc.next();
		for(int i=0; i<w.length(); i++) {
			char wd = w.charAt(i); // charAt()를 사용해 문자열을 한개씩의 문자로 바꾼다
			if(arr[wd-'a']==-1) { // 동일문자 포함하는 경우 처음 나타나 위치로 나타내야 하므로 초기값인 -1일 경우만 변경
				arr[wd-'a']=i; // 소문자 a~z이므로 문자 a를 빼주면 소문자 a부터 인덱스 0으로 시작한다
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}