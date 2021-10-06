import java.util.Scanner;
class InputDowhile
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		System.out.println("N을 입력해주세요");
		int n;
		n= sc.nextInt();

		int i=1;
		int sum=0;
		do{
			sum+=i;
			i++;
		}while(i<=n);

		System.out.printf("1부터 %d까지의 합은 %d입니다",n,sum);
	}
}
