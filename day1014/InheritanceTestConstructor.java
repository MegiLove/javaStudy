class A
{
   public A()
	{
		System.out.println("A의 생성자 동작함");
	}

}

class B extends A
{

	public B()
	{   super();//부모 클래스의 기본생성자를 요구한다
		System.out.printlnl("B의 생성자 동작함");
	}
}

class InheritanceTestConstructor
{
	public static void main(String[] args) 
	{
		B ob= new B();
	}
}
