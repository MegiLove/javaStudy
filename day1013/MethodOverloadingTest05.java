//���� �� ���� �Ű������� ���޹޾� ū ���� ã�� ��ȯ�ϴ� �޼ҵ�
//���� �� ���� �Ű������� ���޹޾� ū ���� ã�� ��ȯ�ϴ� �޼ҵ�
//���� �� ���� �Ű������� ���޹޾� ū ���� ã�� ��ȯ�ϴ� �޼ҵ带
//�ߺ��Ͽ� �����ϰ� ������ ȣ���� ���ϴ�
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