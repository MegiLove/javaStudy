import java.util.Scanner;
class MaxTest 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a,b,max;
		System.out.println("ù��° ���� �Է��ϼ���");
		a= sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		b= sc.nextInt();
		if(a>b)
			max=a;
		else
			max=b;
		System.out.println("ū ����"+max+"�Դϴ�");
	}
}