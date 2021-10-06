import java.util.Scanner;
class Exam09 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.println("x값을 입력하세요");
		int x;
		x= sc.nextInt();
		if(x<=0){int sum1=x*x*x-9*x+2;
			System.out.println(sum1);}
		else
		{int sum2=7*x+2;
			System.out.println(sum2);}
	}
}
