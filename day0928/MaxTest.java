import java.util.Scanner;
class MaxTest 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a,b,max;
		System.out.println("첫번째 수를 입력하세요");
		a= sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		b= sc.nextInt();
		if(a>b)
			max=a;
		else
			max=b;
		System.out.println("큰 수는"+max+"입니다");
	}
}
