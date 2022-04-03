class bisection{
	static double epsilon=0.0000001;
	static double f(double x)
	{
		return x*x*x+x*x-1;
	}
	bisection(double a,double b)
	{
		double r=a;
		while((b-a)>=epsilon)
		{
			
			r=(a+b)/2;
			if(f(r)==0) break;
			else if(f(a)*f(r)<0) b=r;
			else a=r;

		}
		System.out.println(r);
    }
//   public static void main(String[] args)
//   {
//   	double a=0,b=1;
//   	bisection(a,b);
//   }
}