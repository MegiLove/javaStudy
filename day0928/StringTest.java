import java.util.Scanner;
class StringTest
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է����ּ���");
		data= sc.next();
		boolean a;
		a= data.length()>=4;
		System.out.println(a);

	}
}