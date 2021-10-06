import java.util.Scanner;
class Exam01 
{ 
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	 char a;
	 int b,c;
	
	 System.out.println("하나의 문자를 입력해주세요");
     a= sc.next().charAt(0);
     System.out.println("하나의 숫자를 입력해주세요");
     b= sc.nextInt();
	 System.out.println("하나의 숫자를 입력해주세요");
     c= sc.nextInt();
	 if(a=='+')
		System.out.println(b+c);
	 else if(a=='-')
		System.out.println(b-c);
	 else if(a=='*')
		System.out.println(b*c);
	 else if(a=='/'){
        if(c==0)
	    System.out.println("잘못된 입력값입니다"); 
		else 
		System.out.println(b/c);
		}

	}
}
