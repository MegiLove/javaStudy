class MyUtil
{ static void gugudan(int dan){//static�� ���̸� ��ü ���� ���ص� �ȴ� MyUtil mu= new MyUtil(); �̰� ���ص� �ȴٴ� ��
	System.out.printf("***%d��***\n",dan);
	for(int i=1;i<=9 ; i++)
	{
		System.out.printf("%d*%d=%d\n",dan,i,dan*i);
	}
  return;
}
}

class MethodTest02
{
	public static void main(String[] args) 
	{
		MyUtil.gugudan(9);//��ü������ �������Ƿ� �� �տ� Ŭ���� �̸��� �ٿ�����
		System.out.println("============================");
		MyUtil.gugudan(10);
	}
}
