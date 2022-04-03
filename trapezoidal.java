import java.util.Scanner;
import java.lang.*;
class trapezoidal{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int u=sc.nextInt();
		int n=sc.nextInt();
		
		trap tp=new trap(l,u,n);
		
	}
}