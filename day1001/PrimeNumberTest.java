import java.util.Scanner;
class PrimeNumberTest
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
		System.out.println("N�� �Է����ּ���");
	    n= sc.nextInt();
		for(int i=2; i<n; i++){
			if(n%i==0){System.out.println(n+"�� �Ҽ��� �ƴմϴ�");
				
			}
        else
			{System.out.println(n+"�� �Ҽ��Դϴ�");}
		}
	}
}
