class Person 
{
	private String name;
	private int age;
    
	public void setName(String n)
	{
		name=n;
	}
    public void setAge(int n)
	{
		age=n;
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

class PersonTest02
{

	public static void main(String[] args) 
	{
		Person p1;
		p1= new Person();

		p1.setName("ȫ�浿");
		p1.setAge(20);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}
}

/*
PersonTest02.java:15: error: name has private access in Person
                p1.name= "ȫ�浿";
                  ^
PersonTest02.java:16: error: age has private access in Person
                p1.age=20;
                  ^
PersonTest02.java:18: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:19: error: age has private access in Person
        System.out.println(p1.age);

Person Ŭ������ private������ �Ӽ�(�������)�� ���� ������ �� ����
������ �� �ִ� �޼ҵ带 public�� �����ΰ� ����ؾ��Ѵ�
�����ؼ� ���� �����ϴ� �޼ҵ�� setXXX�� �����
�����ؼ� ���� �о���� �޼ҵ�� getXXX�� �����
�̰��� setter, getter��� �θ���

���� Ŭ������ ���� ����
������ ��� ����������� private������ �ΰ�
�� private������ ��������� �����ϱ� ���� setter getter��
public�� ��� ������ �Ѵ�

setter�� ��������� ���� �����ϱ� ���� �޼ҵ��̴�
������� �ٲ��� �Ű������� �ʿ��ϰ�
getter�� �Ű������� �ʿ����

getter�� ��������� ���� ��ȯ�ϴ� �޼ҵ��̴�
��ȯ���� �ְ� setter�� ��ȯ���� ����
*/