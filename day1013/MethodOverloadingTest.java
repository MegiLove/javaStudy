class SistUtil
{  
	
	
   //�� ���� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
   public static void max(int a, int b)
	{   int max;
		if(a>b)
			max=a;
		else
			max=b;

		System.out.println("ū ��"+max);
	}

	public static void max2(double a, double b)
	{   double max2;
		if(a>b)
			max2=a;
		else
			max2=b;

		System.out.println("ū ��"+max2);
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
