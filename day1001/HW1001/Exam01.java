import java.util.Scanner;
class Exam01 
{ 
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	 char a;
	 int b,c;
	
	 System.out.println("�ϳ��� ���ڸ� �Է����ּ���");
     a= sc.next().charAt(0);
     System.out.println("�ϳ��� ���ڸ� �Է����ּ���");
     b= sc.nextInt();
	 System.out.println("�ϳ��� ���ڸ� �Է����ּ���");
     c= sc.nextInt();
	 if(a=='+')
		System.out.println(b+c);
	 else if(a=='-')
		System.out.println(b-c);
	 else if(a=='*')
		System.out.println(b*c);
	 else if(a=='/'){
        if(c==0)
	    System.out.println("�߸��� �Է°��Դϴ�"); 
		else 
		System.out.println(b/c);
		}

	}
}
