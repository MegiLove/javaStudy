class SistUtil
{  
	
	
   //두 개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
   public static void max(int a, int b)
	{   
	   max((double)a,(double)b);
	}

	public static void max(double a, double b)
	{   double max;
		if(a>b)
			max=a;
		else
			max=b;

		System.out.println("큰 수"+max);
	}

}

class MethodOverloadingTest03 
{
	public static void main(String[] args) 
	{
		SistUtil.max(5,7);
		SistUtil.max(3.4,7.2);
	}
}
