class Family
{
	private String name;
	private int age;
	private String role;
	public static String addr;

	public Family(String name, int age, String role)
	{
		this.name= name;
		this.age= age;
		this.role= role;
	}
	
	public Family()
	{
			
	}

	public String toString()
    {
		return "[name:"+name+",age"+age+",role"+role+",addr"+addr+"]";
    }

	public static void pro()
	{
		System.out.println("�ּ�: "+addr);
		//name���� ������ �� ����. static �Լ��� static ������ ���� �� �ִ�
	}
}

class StaticTest02
{
	public static void main(String[] args) 
	{
		Family.addr= "����� ������ ������ 1234";
		Family.pro();
	}
}