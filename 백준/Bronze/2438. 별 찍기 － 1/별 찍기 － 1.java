import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        for(int i=0; i<a; i++)
        {
        	b++;
        	for(int j=0; j<b; j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}
}