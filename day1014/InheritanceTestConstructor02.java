class A
{
   public A()
	{
		System.out.println("A�� �⺻������ ������");
	}

	public A(int i)
	{
		System.out.println("A�� �Ű������� ���� ������ ������");
	}

}

class B extends A
{

	public B()
	{   super();//�θ� Ŭ������ �⺻�����ڸ� �䱸�Ѵ�
		System.out.println("B�� ������ ������");
	}
}

class InheritanceTestConstructor02
{
	public static void main(String[] args) 
	{
		B ob= new B();
	}
}
