import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=n;
		while(a<=b) {
			int m=a+(b-a)/2;
			int sqrt=m*m;
			if(sqrt==n) {
				System.out.println(m);
				break;
			} else if(sqrt>n) {
				b=m-1;
			} else {
				a=m+1;
			}
		}
	}
}