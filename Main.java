import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);

        // falsi fl=new falsi(100,100);
        // bisection bi=new bisection(0,1);
        // secant sc=new secant(0,1);
        // newton nn=new newton(1);

            


            //    Scanner sc=new Scanner(System.in); 
               int n=sc.nextInt();
                float x[] = new float[n];
                int i,j;
                for(i=0;i<n;i++)
                    x[i]=sc.nextFloat();
                float y[][]=new float[n][n];
                for(i=0;i<n;i++)
                {
                    y[i][0]=sc.nextFloat();
                }
                float value=sc.nextFloat();
                newtonfwd nw=new newtonfwd(x,y,n,value);
                
           

            // Scanner input = new Scanner(System.in);
            // int n;
            // int i,j;
            // float a;
            // System.out.println("Enter number of point: ");
            // n = input.nextInt();
            // float x[] = new float[n];
            // float f[] = new float[n];
            // System.out.println("Enter value x for calculation: ");
            // a = input.nextFloat();
            // for (i = 0; i < n; i++) {
            //     x[i] = input.nextFloat();
            //     f[i] = input.nextFloat();               
            // }
            // lagrange lg=new lagrange(n,a,x,f);
            
           

        //    Scanner sc=new Scanner(System.in); 
        //     float[] x = new float[7];
        //     float[] y = new float[7];
        //     int i,n=4;
            
        //     for (i=0; i<n; i++)
        //     {
        //         x[i]=sc.nextFloat(); 
        //         y[i]=sc.nextFloat(); 
        //     }
        //     curve cr=new curve(n, x, y);

            // Scanner sc=new Scanner(System.in);
            // int l=sc.nextInt();
            // int u=sc.nextInt();
            // int n=sc.nextInt();
            // simpson sr=new simpson(l,u,n);

            // Scanner sc=new Scanner(System.in);
            // float x0=sc.nextFloat();
            // float y0=sc.nextFloat();
            // float xn=sc.nextFloat();
            // int n=sc.nextInt();
            // euler eu=new euler(n, x0, y0, xn);


            //
            // int n=4,i;
            // float  sum;
            // float y[][]=new float[10][10];
            // float x[]={5,6,9,11};
            // for(i=0;i<n;i++)
            //    y[i][0]=sc.nextFloat();
            // int value=7;
            // newton_divided nw=new newton_divided(y,x,n,value);
    }
}
