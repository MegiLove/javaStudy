import java.util.Scanner;
class NTest 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("������ ���� �Է��ϼ���");
		n= sc.nextInt();
		if(n>0){
           System.out.println(n+100);
		   System.out.println("�۾�����");
		}
		else{
			System.out.println(n*n);
		   System.out.println("�۾�����");
		}
	}
}
