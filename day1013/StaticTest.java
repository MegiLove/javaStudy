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
}

class StaticTest 
{
	public static void main(String[] args) 
	{
		Family.addr="����� ������ ������ 1234"; //��ü�� �������� �ʰ� ����Ѵ� �׷��� Ŭ���� �̸����� ����
		//(��ü).addr�� ����
		System.out.println("�ּ�: "+Family.addr);

		Family.name="ȫ�浿" //��ü�� �����ؼ� ��ü���� �����ؾ� ��
	}
}
