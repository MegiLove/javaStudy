class A
{
   public A()
	{
		System.out.println("A�� ������ ������");
	}

}

class B extends A
{

	public B()
	{   super();//�θ� Ŭ������ �⺻�����ڸ� �䱸�Ѵ�
		System.out.printlnl("B�� ������ ������");
	}
}

class InheritanceTestConstructor
{
	public static void main(String[] args) 
	{
		B ob= new B();
	}
}