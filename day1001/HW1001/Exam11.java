import java.util.Scanner;
class Exam11 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.println("������ �Է��ϼ���");
	  int a;
	  a= sc.nextInt();
	  if(a<0)
		{System.out.println("�߸��� �Է°��Դϴ�");
	  return;}

	  for(int i=1; i<=a; i++)
		{ 
		  if(i%3==0)
			System.out.println(i);
	      
		
	}
}
}
