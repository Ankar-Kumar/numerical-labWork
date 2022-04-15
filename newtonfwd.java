import java.util.Scanner;

class newtonfwd{
    static float temp;
    static int f;
    private int fact(int n)
    {
      f = 1;
     for (int i = 2; i <= n; i++)
         f *= i;
     return f;
    }
   private  float u_cal(float u, int n)
   {
    temp= u;
    for (int i = 1; i < n; i++)
        temp *=(u - i);//(x-1)(x-2).......
    return temp;
   }
  
   newtonfwd(float[] x, float[][] y,int n,float value)
  {
  	int i,j;
    for (i = 1; i < n; i++) {
        for (j = 0; j < n - i; j++)
            y[j][i] = y[j + 1][i - 1] - y[j][i - 1];//
    }
   
    float sum = y[0][0];
    float u = (value - x[0]) / (x[1] - x[0]);
    for (i = 1; i < n; i++) {
        sum = sum + (u_cal(u, i) * y[0][i]) /fact(i);
    }
    System.out.println(sum);
    
  }
}