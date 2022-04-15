import java.util.Scanner;
import java.lang.*;
class trapezoidal{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float l=sc.nextFloat();
		float u=sc.nextFloat();
		float n=sc.nextFloat();
		
		trap tp=new trap(l,u,n);
		
	}
}