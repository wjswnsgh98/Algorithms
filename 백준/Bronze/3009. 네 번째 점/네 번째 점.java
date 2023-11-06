import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int x[] = new int[4];
			int y[] = new int[4];
			
			int dx = 0;
			int dy = 0;
			
			for(int i=0; i<3; i++) {
				String text[] = br.readLine().split(" ");
				x[i] = Integer.parseInt(text[0]);
				y[i] = Integer.parseInt(text[1]);
			}
			
			// x
			if(x[1] == x[2]) {
				dx = x[0];
			}else if(x[0] == x[1]) {
				dx = x[2];
			}else {
				dx = x[1];
			}
			
			// y
			if(y[1] == y[2]) {
				dy = y[0];
			}else if(y[0] == y[1]) {
				dy = y[2];
			}else {
				dy = y[1];
			}
			
			System.out.println(dx + " " + dy);
			
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}