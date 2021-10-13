class SistUtil
{  
	
	
   //두 개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
   public static void max(int a, int b)
	{   int max;
		if(a>b)
			max=a;
		else
			max=b;

		System.out.println("큰 수"+max);
	}

	public static void max2(double a, double b)
	{   double max2;
		if(a>b)
			max2=a;
		else
			max2=b;

		System.out.println("큰 수"+max2);
	}

}

class MethodOverloadingTest 
{
	public static void main(String[] args) 
	{
		SistUtil.max(5,7);
		SistUtil.max2(3.4,7.2);
	}
}
