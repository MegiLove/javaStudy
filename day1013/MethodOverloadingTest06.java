class SistUtil
{
	public static int sum(int data[])
	{
		int sum=0;
		int arr[]= data;
        for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}

		return sum;
	}

	public static double sum(double data[])
	{ double sum=0;
		double arr[]=data;
        for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}

}


class MethodOverloadingTest06
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		double b[]= {1.2,3.3,4.2};
		System.out.println(SistUtil.sum(a));
		System.out.println(SistUtil.sum(b));
	}
}
