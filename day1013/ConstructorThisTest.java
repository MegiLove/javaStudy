class Person
{ private String name;
  private int age;
	public Person(String name,int age)
	{
			this.name= name; 
			this.age=age;
			System.out.println("�Ű������� ��� ���� ������ ������");
	}

	public Person()
	{
		this("ȫ�浿",20); //this()�� �������� ù��° ���忡 �;� �Ѵ�
		System.out.println("�Ű������� ���� �ʴ� ������ ������");
	}

	public String toString()
	{
		return "�̸�: "+name+",����: "+age;
	}
}

class ConstructorThisTest
{
	public static void main(String[] args) 
	{
		Person p1= new Person("������",30);
        Person p2= new Person();
		System.out.println(p1);
		System.out.println(p2);
	}
}
