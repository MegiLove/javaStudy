class Person
{
	private String name;
	private int age;

	public void setAge(int age)
	{
		this.age= age;
	}
	public void setName(String name)
	{
		this.name= name;
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

class PersonTest03 
{
	public static void main(String[] args) 
	{
		Person p1= new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}

/*
C:\javaStudy\day1012>java PersonTest03
null
이 나오게 된다
멤버변수와 매개변수를 둘이 똑같이 하였을 때 이런 오류가 발생한다
매개변수 name을 매개변수에 넣게 되기 때문에
멤버변수 name에는 아무것도 저장된 값이 없다
메소드 안에서 멤버변수에 접근하려면 this키워드를 사용한다
*/