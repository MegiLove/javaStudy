import java.util.Scanner;
class Exam07 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int a,b,c;
		a=sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
        b=sc.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		c=sc.nextInt();

		if(a<b && a<c)
         System.out.println("가장 작은 값: "+a);
		else if(b<a && b<c)
         System.out.println("가장 작은 값: "+b);
		else if(c<a && c<b)
         System.out.println("가장 작은 값: "+c);
	}
}
