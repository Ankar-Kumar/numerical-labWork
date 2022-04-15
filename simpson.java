import java.util.Scanner;
import java.lang.*;
class simpson{
	static float sum=0,k;
	private float f(float x){
		return 1/(1+x*x);
	}
	simpson(float l,float u,float n)
	{
		float i;
		float h=(u-l);
		h/=n;
		sum=f(l)+f(u);
		for(i=1;i<n;i++)
		{
			k=l+i*h;
			if(i%2==0)
			   sum+=2*f(k);
		   else 
		   	   sum+=4*f(k);
		}
		float d=(sum*h)/3;
		System.out.println(d);
	}
}