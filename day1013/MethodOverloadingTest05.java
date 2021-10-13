//정수 두 개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드
//정수 세 개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드
//정수 네 개를 매개변수로 전달받아 큰 수를 찾아 반환하는 메소드를
//중복하여 정의하고 각각을 호출해 봅니다
class SistUtil
{
	public static int max(int a,int b)
	{
		int max;
		if(a>b)
			max=a;
		else
			max=b;

		return max;
	}

	public static int max(int a,int b, int c)
	{
		int max;
		if(a>b && a>c)
			max=a;
		else if(b>a && b>c)
			max=b;
		else
			max=c;

		return max;
	}

	public static int max(int a,int b, int c,int d)
	{
		int max;
		if(a>b && a>c &&a>d)
			max=a;
		else if(b>a && b>c && b>d)
			max=b;
		else if(c>a && c>b && c>d)
			max=c;
		else
			max=d;

		return max;
	}
}


class MethodOverloadingTest05 
{
	public static void main(String[] args) 
	{
		System.out.println(SistUtil.max(2,3));
		System.out.println(SistUtil.max(2,3,4));
		System.out.println(SistUtil.max(2,3,4,5));
	}
}
