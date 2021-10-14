class A
{
   public A()
	{
		System.out.println("A의 기본생성자 동작함");
	}

	public A(int i)
	{
		System.out.println("A의 매개변수를 갖는 생성자 동작함");
	}

}

class B extends A
{

	public B()
	{   super();//부모 클래스의 기본생성자를 요구한다
		System.out.println("B의 생성자 동작함");
	}
}

class InheritanceTestConstructor02
{
	public static void main(String[] args) 
	{
		B ob= new B();
	}
}
