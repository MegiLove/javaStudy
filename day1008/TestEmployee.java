import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;
}

/*
�ǿ찡 �տ� �������� ��� �̽�Ʈ���� �ް� ���࿡ ���ϴ�

Ŭ������ ������ ������ ���� ǥ���ϰ��� �ϴ� ��ü�� ���ؼ�
� �Ӽ��� ������ ������ �ϴ��� �м��� �ؾ� �Ѵ�
�Ӽ�- �������
����- ����޼ҵ�(����Լ�)
*/
class TestEmployee
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Employee []e= new Employee[5];
		for(int i=0; i<e.length; i++){
		e[i]= new Employee();
		System.out.println("�̸��� �Է����ּ���");
		e[i].name= sc.next();
		System.out.println("�ּ��� �Է����ּ���");
		e[i].addr= sc.next();
		System.out.println("������ �Է����ּ���");
		e[i].salary= sc.nextInt();
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		e[i].phone= sc.next();
	    }

		System.out.print("�̸�\t�ּ�\t����\t��ȭ��ȣ\n");
        for(int i=0; i<e.length; i++)
		{			
		  System.out.printf("%s\t%s\t%d\t%s\n",e[i].name,e[i].addr,e[i].salary,e[i].phone);
        }
	}
}