import java.util.Scanner;
class ThreeSmall 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
       int a,b;
		System.out.println("정수 a를 입력하세요");
		a=sc.nextInt();
		System.out.println("정수 b를 입력하세요");
		b=sc.nextInt();
		System.out.println((a>b)?"작은 수는"+b:"작은 수는 "+a);
	}
}
