import java.util.Scanner;
class Exam09 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int data;
		System.out.println("10000���� ���� ������ �Է��ϼ���");
		data= sc.nextInt();	
		System.out.println("õ�� �ڸ�:"+data/1000);
		System.out.println("���� �ڸ�:"+data/100%10);
		System.out.println("���� �ڸ�:"+data/10%10);
		System.out.println("���� �ڸ�:"+data%10);

	}
}
