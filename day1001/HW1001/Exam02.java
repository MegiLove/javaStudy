import java.util.Scanner;
class Exam02  
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  char a;
		System.out.println("하나의 문자를 입력하세요");
		a= sc.next().charAt(0);
		if(a=='R')
		{ int b,c;
		System.out.println("사각형의 가로길이를 입력하세요");
		b= sc.nextInt();
		System.out.println("사각형의 세로길이를 입력하세요");
		c= sc.nextInt();
		System.out.println("사각형의 면적:"+(b*c)); 
		}
		else if(a=='T')
		{ int b,c;
       
		System.out.println("삼각형의 한 변의 길이를 입력하세요");
		b= sc.nextInt();
		System.out.println("삼각형의 높이를 입력하세요");
		c= sc.nextInt();
		System.out.println("삼각형의 면적:"+((double)b*c/2)); 
		}
		else if(a=='C')
		{ int b;
		System.out.println("반지름의 길이를 입력하세요");
		b= sc.nextInt();
		System.out.println("원의 면적:"+((double)b*b*3.14)); 
		}
	}
}
