import java.lang.Math;
class secant{
	
private double f(double a)
{
    return a*a*a - a*5 + 1;
}
secant(double a,double b)
{
    double r=a;
    for(int i=0; i<5; i++)
    {
        r=(a*f(b)-b*f(a))/(f(b)-f(a));
        a=b;
        b=r;

    }
    System.out.println(r);
}
	
}