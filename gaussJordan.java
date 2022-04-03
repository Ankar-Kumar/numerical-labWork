

import java.util.Scanner;

public class gaussJordan{
	
	gaussJordan(double[][] a,int n) {

	    int i,j,k;
		double c=0;
	     for(j=1; j<=n; j++)
           {
		       for(i=1;i<=n;i++)
		       {
			       	if(i!=j)
			       	{
			       		c=a[i][j]/a[j][j];
			       		for(k=1;k<=n+1;k++)
			       			a[i][k]=a[i][k]-c*a[j][k];
			       	}
		       }
		    }
	    double x[]=new double[100];
	    /*x[n]=a[n][n+1]/a[n][n];
	    for(i=n-1;i>=1;i--)
	    {
	    	double sum=0;
	    	for(j=i+1;j<=n;j++)
	    		sum+=a[i][j]*x[j];
	    	x[i]=(a[i][n+1]-sum)/a[i][i];
	    }*/
	    for(i=1;i<=n;i++)
    	{
    		x[i]=a[i][n+1]/a[i][i];
    		System.out.println(x[i]);
    	}
	    
	}
}
/*n=3
10 -7 5 9 3 6 0 -9 9 3 -2 -1*/

