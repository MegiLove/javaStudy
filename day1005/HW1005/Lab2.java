import java.util.Scanner;
class Lab2 
{
	public static void main(String[] args) 
	{   Scanner sc= new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		char a;
		a= sc.next().charAt(0);
		switch(a){
		case 'a': System.out.println("�Էµ� ����"+a+"�� �����Դϴ�"); break;
		case 'e': System.out.println("�Էµ� ����"+a+"�� �����Դϴ�"); break;
		case 'i': System.out.println("�Էµ� ����"+a+"�� �����Դϴ�"); break;
		case 'o': System.out.println("�Էµ� ����"+a+"�� �����Դϴ�"); break;
		case 'u': System.out.println("�Էµ� ����"+a+"�� �����Դϴ�"); break;
        default : System.out.println("�Էµ� ����"+a+"�� ������Դϴ�"); 
		}

	}
}
