class SistUtil
{  
	
	
   //�� ���� ������ �Ű������� ���޹޾� �� �߿� ū���� ã�� ����ϴ� �޼ҵ带 ����
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

		System.out.println("ū ��"+max);
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