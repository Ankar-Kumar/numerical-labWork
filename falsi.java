import java.lang.Math;
class falsi{
	private int iteration=100000;
static double f(double a)
{
    return a*a*a - a*a + 2;
}
falsi(double a,double b)
{
    double r=a;
    for(int i=0; i<iteration; i++)
    {
        r=(a*f(b)-b*f(a))/(f(b)-f(a));
        if(f(r)==0)
            break;
        else if(f(r)*f(a)<0)
            b=r;
        else
            a=r;
    }
    System.out.println(r);
}
	// public static void main(String[] args)
	// {
    //    double a=-100,b=100;//,c,i;
    //    falsi(a,b);
	// }
}