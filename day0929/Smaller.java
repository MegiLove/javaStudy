import java.util.Scanner;
class Smaller
{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
     int a,b;
	System.out.println("���� a�� �Է����ּ���");
	a= sc.nextInt();
    System.out.println("���� b�� �Է����ּ���");
	b= sc.nextInt();
	if(a>b)
		System.out.println("���� ����" +b+"�Դϴ�");
	if(a<b)
        System.out.println("���� ����" +a+"�Դϴ�");
	if(a==b)
		System.out.println("�� ���� �����ϴ�");
	}
}