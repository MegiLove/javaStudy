class RecursiveMethodTest02 
{   
    public static int getSum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+getSum(n-1);
	}

	public static void main(String[] args) 
	{
		System.out.printf("5Sum=%d\n",getSum(5));
	}
}
