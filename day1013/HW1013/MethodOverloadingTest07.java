import java.util.Arrays;
class SistUtil
{
	public static int[] sum(int data[], int data2[])
	{
		int length1 = data.length;
		int length2 = data2.length;
		int []concate = new int[length1+length2];
		for (int i =0; i<length1; i++)
		{
			concate[i] = data[i];
		}
		for (int i =0; i<length2; i++)
		{
			concate[i+length1] = data2[i];
		}
		return concate;
	}

	public static double[] sum(double data[], double data2[])
	{ 
		int length1 = data.length;
		int length2 = data2.length;
		double []concate = new double[length1+length2];
		for (int i =0; i<length1; i++)
		{
			concate[i] = data[i];
		}
		for (int i =0; i<length2; i++)
		{
			concate[i+length1] = data2[i];
		}
		return concate;
	}

}


class MethodOverloadingTest07
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		double c[]= {1.0,2.7,3.3,4.2,5.9};
		double d[]= {6.3,7.8,8.1,9.6,10.2};
		System.out.println(Arrays.toString(SistUtil.sum(a,b)));
		System.out.println(Arrays.toString(SistUtil.sum(c,d)));

	}
}
