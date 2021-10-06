import java.util.Scanner;
class DiviN 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
	  System.out.println("N을 입력해주세요");
	  n= sc.nextInt();
	  System.out.println(n+"의 약수는 다음과 같습니다");
	  for(int i=1; i<=n; i++){
		if(n%i==0){
            System.out.println(i);
		}

	  }

	}
}
