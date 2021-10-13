class Person
{
	private String name;
	private int age;
	public Person(String name, int age)
	{
		this.name= name;
		this.age= age;
	}
	public Person()
	{
		
	}
	public String toString()
	{
		return name+","+age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}


class CallByReferenceObject
{ 
	public static void plusOne(Person p1)
	{
		p1.setAge(p1.getAge()+1);
	}

	public static void main(String[] args) 
	{
		Person p1= new Person("ȫ�浿",20);
		System.out.println(p1);
		plusOne(p1);
		System.out.println(p1);

	}
}
