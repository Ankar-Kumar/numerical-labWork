

import java.util.Scanner;

public class gauss{
	
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    int n,i, j,k;
	    
	   double c;
	    System.out.println("Enter number of point: ");
	    n = input.nextInt();
	    double a[][]= new double[100][100];
	    for(i=1;i<=n;i++)
	    {
	    	for(j=1;j<=n+1;j++)
	    	{
	    		a[i][j]=input.nextDouble();
	    	}
	    }
	     for(j=1; j<=n; j++)
           {
		       for(i=1;i<=n;i++)
		       {
			       	if(i>j)
			       	{
			       		c=a[i][j]/a[j][j];
			       		for(k=1;k<=n+1;k++)
			       			a[i][k]=a[i][k]-c*a[j][k];
			       	}
		       }
		    }
	    double x[]=new double[100];
	    x[n]=a[n][n+1]/a[n][n];
	    for(i=n-1;i>=1;i--)
	    {
	    	double sum=0;
	    	for(j=i+1;j<=n;j++)
	    		sum+=a[i][j]*x[j];
	    	x[i]=(a[i][n+1]-sum)/a[i][i];
	    }
	    for(i=1;i<=n;i++)
	    	System.out.println(x[i]);
	    
	}
}
/*n=3
10 -7 3 5 -6 8 4 7 2 6 9 -1*/

