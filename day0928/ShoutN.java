import java.util.Scanner;
class ShoutN
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.print("임의의 수 N을 입력해주세요 ");
		n= sc.nextInt();
        boolean a;
		a=n%6==0;
        System.out.println(a);
	}
}
