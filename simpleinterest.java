package programs;
import java.util.Scanner;34
public class simpleinterest {
	public static void main(String[] args) {
		int p,t,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of p");
		p=sc.nextInt ();
		t=sc.nextInt ();
		r=sc.nextInt ();
		
		System.out.println((p*t*r)/100+"is the simpleinterest");
		
		
	}

}
