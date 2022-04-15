import java.lang.Math;
class falsi{
	private int iteration=100000;
    private double a,b;
static double f(double a)
{
    return a*a*a - 5*a -5;
}
 

falsi(double a,double b){
    this.a=a;
    this.b=b;
    int i=1;
    b=i;
    while(f(a)*f(b)>0){
        a=b;
        i++;
        b=i;

    }
    // System.out.println(a);
    // System.out.println(b);
    double root=falsi(a,b);
    System.out.println(root);
}
private double falsi(double a,double b)
{
    double r=a;
    for(int i=0;i<10;i++)
    {
        r=b-((b-a)*f(b)/(f(b)-f(a)));
        if(f(r)==0)
            break;
        else if(f(r)*f(a)<0)
            b=r;
        else
            a=r;
    }
    return r;
}
	// public static void main(String[] args)
	// {
    //    double a=-100,b=100;//,c,i;
    //    falsi(a,b);
	// }
}