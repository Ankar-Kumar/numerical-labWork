class trap{
	
	private double sum,k;
	private double f(double x){
		return 1/(1+x*x);
	}
	trap(float l,float u,float n){
	    double h=(u-l);
		h/=n;
		sum=f(l)+f(u);
		for(float i=1;i<n;i++)
		{
			k=l+i*h;
			sum+=2*f(k);
		}
		System.out.println(sum*h/2);
	}
}