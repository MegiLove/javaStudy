class ArrayTest02
{
	public static void main(String[] args) 
	{
		int []a;
		a= new int[5];

		int []b= new int[5];
		boolean []c= new boolean[5];
		double []d= new double[5];
		String []e= new String[5];

		a[0]= 100;
		b[0]= 100;

		System.out.println(a[0]);
		System.out.println(b[0]);

        System.out.println(a[1]);
		System.out.println(b[1]);
		System.out.println(c[1]);
		System.out.println(d[1]);
		System.out.println(e[1]);

		a[5]= 100;
        System.out.println(a[5]);

	}
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayTest02.main(ArrayTest02.java:25)*/