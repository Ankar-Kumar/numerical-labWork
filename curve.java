import java.util.Scanner;
class curve{
  curve(int n,float[] x,float[] y){
  int i,j;
    float sumy=0, sumx=0, sumxy=0, sumxx=0;
    for (i=0; i<n; i++)
    {
        sumy+= y[i];
        sumx+= x[i];
        sumxy+= y[i]*x[i];
        sumxx+= x[i]*x[i];
    }
    float a=(sumx*sumxy-sumy*sumxx)/(sumx*sumx-n*sumxx);
    float b=(sumy*sumx-n*sumxy)/(sumx*sumx-n*sumxx);

    //cout<<"\n\nThe best fit value of curve is : y = "<< a<< " + "<< b<< "x.\n\n"<<endl;
    System.out.println(a);
    System.out.println(b);


  }
}