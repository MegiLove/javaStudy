import java.util.Scanner;
class InputInt02
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
        double a,b,c;
		System.out.println("���� �� ���� �Է����ּ���");
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();

		if(a>b && a>c){
		System.out.println("���� ū ����"+a);
		}
		else if(b>a && b>c){
		System.out.println("���� ū ����"+b);
		}
		else if(c>a && c>b){
		System.out.println("���� ū ����"+c);
		}
		
	}
}
