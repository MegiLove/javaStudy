import java.util.Scanner;
class Exam03 
{
	public static void main(String[] args) 
	{   Scanner sc= new Scanner(System.in);
		System.out.println("������ ������ ������ �Է��ϼ���");
		int a;
		a= sc.nextInt();
		if(a>=10)
		{double sum= 100*0.9*a;
			System.out.println("��ü ����: "+sum);
		}
		else{int sum= 100*a;
			System.out.println("��ü ����: "+sum);
		}

	}
}
