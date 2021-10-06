import java.util.Scanner;
class PrimeNumberTest
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
		System.out.println("N을 입력해주세요");
	    n= sc.nextInt();
		for(int i=2; i<n; i++){
			if(n%i==0){System.out.println(n+"은 소수가 아닙니다");
				
			}
        else
			{System.out.println(n+"은 소수입니다");}
		}
	}
}
