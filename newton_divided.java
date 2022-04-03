public class newton_divided {
     private float function(int i,int value,float x[]){
         float prod=1;
         for(int j=0;j<i;j++)
         {
             prod*=(value-x[j]);
         }
         return prod;
     }
    newton_divided(float y[][],float x[],int n,int value){
        int i,j;
        //calculate table 
        for(i=1;i<n;i++)
        for(j=0;j<n-i;j++)
        {
            y[j][i]=(y[j][i-1]-y[j+1][i-1])/(x[j]-x[i+j]);
        }
        //answer calculation
        float sum=y[0][0];

        for(i=1;i<n;i++)
        {
            sum+=function(i,value,x)*y[0][i];
        }
        System.out.println(sum);
    }
}
