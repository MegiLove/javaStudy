import java.util.Scanner;
class StringTest
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력해주세요");
		data= sc.next();
		boolean a;
		a= data.length()>=4;
		System.out.println(a);

	}
}
