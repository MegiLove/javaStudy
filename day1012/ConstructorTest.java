class Person
{
	private String name;
	private int age;
	public Person()
	{
		name="������";
		age=20;
	}

	public void setName(String name)
	{
		this.name= name;
	}

	public void setAge(int age)
	{
		this.age= age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
}

class ConstructorTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
