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
		p1.setName("ȫ�浿");
		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}

/*
C:\javaStudy\day1012>java PersonTest03
null
�� ������ �ȴ�
��������� �Ű������� ���� �Ȱ��� �Ͽ��� �� �̷� ������ �߻��Ѵ�
�Ű����� name�� �Ű������� �ְ� �Ǳ� ������
������� name���� �ƹ��͵� ����� ���� ����
�޼ҵ� �ȿ��� ��������� �����Ϸ��� thisŰ���带 ����Ѵ�
*/