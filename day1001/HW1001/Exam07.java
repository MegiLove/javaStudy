import java.util.Scanner;
class Exam07 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���");
		int a,b,c;
		a=sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���");
        b=sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���");
		c=sc.nextInt();

		if(a<b && a<c)
         System.out.println("���� ���� ��: "+a);
		else if(b<a && b<c)
         System.out.println("���� ���� ��: "+b);
		else if(c<a && c<b)
         System.out.println("���� ���� ��: "+c);
	}
}
