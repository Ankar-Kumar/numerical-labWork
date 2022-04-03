import java.util.Scanner;

class euler{
	static float yn;
	static float f(float x,float y){
		return x+y;
	}
	euler(int n,float x0,float y0,float xn)
	{
		
		
		float h=(xn-x0)/n;
		for(int i=0;i<n;i++)
		{
			yn=y0+h*f(x0,y0);
			y0=yn;
			x0+=h;
		}
		System.out.println(yn);
	}
}