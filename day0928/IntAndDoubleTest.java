class IntAndDoubleTest 
{
	public static void main(String[] args) 
	{
		//������ ������ �����ϸ� ����� ������ �ȴ�
		//���� ������ ������ �����Ͽ� �Ǽ����� ���⸦ ���Ѵٸ� 
		//���� �� �ϳ��� �Ǽ��� ����ȯ�Ͽ� �����ؾ� �մϴ�

		int a=5;
		int b=2;
		
		double result;
		//result= a/b;
        result= a/(double)b;
		System.out.println("������ ���:"+result);
	}
}

/*
C:\javaStudy\day0928>java IntAndDoubleTest
������ ���:2.0

C:\javaStudy\day0928>java IntAndDoubleTest
������ ���:2.5
*/