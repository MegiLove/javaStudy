import java.util.Scanner;
class Exam02  
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  char a;
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���");
		a= sc.next().charAt(0);
		if(a=='R')
		{ int b,c;
		System.out.println("�簢���� ���α��̸� �Է��ϼ���");
		b= sc.nextInt();
		System.out.println("�簢���� ���α��̸� �Է��ϼ���");
		c= sc.nextInt();
		System.out.println("�簢���� ����:"+(b*c)); 
		}
		else if(a=='T')
		{ int b,c;
       
		System.out.println("�ﰢ���� �� ���� ���̸� �Է��ϼ���");
		b= sc.nextInt();
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		c= sc.nextInt();
		System.out.println("�ﰢ���� ����:"+((double)b*c/2)); 
		}
		else if(a=='C')
		{ int b;
		System.out.println("�������� ���̸� �Է��ϼ���");
		b= sc.nextInt();
		System.out.println("���� ����:"+((double)b*b*3.14)); 
		}
	}
}