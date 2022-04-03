class trap{
	
	private double sum,k;
	private double f(double x){
		return 1/(1+x*x);
	}
	trap(int l,int u,int n){
	double h=(u-l);
		h/=n;
		sum=f(l)+f(u);
		for(int i=1;i<n;i++)
		{
			k=l+i*h;
			sum+=2*f(k);
		}
		System.out.println(sum*h/2);
	}
}