import java.util.Scanner;
class Exam03 
{
	public static void main(String[] args) 
	{   Scanner sc= new Scanner(System.in);
		System.out.println("구입한 물건의 개수를 입력하세요");
		int a;
		a= sc.nextInt();
		if(a>=10)
		{double sum= 100*0.9*a;
			System.out.println("전체 가격: "+sum);
		}
		else{int sum= 100*a;
			System.out.println("전체 가격: "+sum);
		}

	}
}
