import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int p=n;
		while(0<n){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(p==rev){
		    System.out.println("True");
		    
		}
		else{
		     System.out.println("False");
		}
	}
}