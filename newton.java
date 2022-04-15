import java.lang.Math;
class newton{
    private double a;
    private double f(double a){
        return a*a*a+a*a-1;
    }
    private double g(double a){
        return 3*a*a+2*a;
    }
    newton(double a)
    {
        this.a=a;
        double root=newtonMethod(a);
        System.out.println(root);
    }
    private double newtonMethod(double a){
        double c=(f(a)/g(a));
        while(Math.abs(c)>=.001){
            c=f(a)/g(a);
            a-=c;
        }
        return a;
    }
}


// import java.lang.Math;
// class newton{


// static double f(double a)
// {
//     return a*a*a+a*a-1;
// }
// static double g(double a)
// {
//     return 3*a*a+2*a;
// }
// newton(double a)
// {
//     double r=f(a)/g(a);
//     while(Math.abs(r)>=0.001)
//     {
//         r=f(a)/g(a);
//         a=a-r;
//     }
//     System.out.println(a);
// }
	
// }