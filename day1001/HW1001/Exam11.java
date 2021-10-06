import java.util.Scanner;
class Exam11 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.println("정수를 입력하세요");
	  int a;
	  a= sc.nextInt();
	  if(a<0)
		{System.out.println("잘못된 입력값입니다");
	  return;}

	  for(int i=1; i<=a; i++)
		{ 
		  if(i%3==0)
			System.out.println(i);
	      
		
	}
}
}
