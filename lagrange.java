
import java.util.Scanner;

public class lagrange {
	
	lagrange(int n,float a,float[] x,float[]f) {
	    int i,j;
		float sum=0;
	   for(i=0;i<n;i++)
            {
                double temp=1;
                for(j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                         temp *= (a - x[j])/(x[i] - x[j]);                         
                    }
                }
                sum+= temp * f[i];
            }
	    System.out.println("The estimated value of f(x)= " + sum);

	}
}

