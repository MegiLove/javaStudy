import java.util.Scanner;
class InputDowhile
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		System.out.println("N�� �Է����ּ���");
		int n;
		n= sc.nextInt();

		int i=1;
		int sum=0;
		do{
			sum+=i;
			i++;
		}while(i<=n);

		System.out.printf("1���� %d������ ���� %d�Դϴ�",n,sum);
	}
}
