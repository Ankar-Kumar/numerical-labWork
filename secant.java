import java.lang.Math;
class secant{
	
private double f(double a)
{
    return a*a*a - a*5 -5;
}
secant(double a,double b)
{
    double r=0;
    while(Math.abs(a-b)>=0.001)
    {
        r=b-(f(b)*(b-a)/(f(b)-f(a)));
        a=b;
        b=r;
        
    }
    System.out.println(r);
}
	
}