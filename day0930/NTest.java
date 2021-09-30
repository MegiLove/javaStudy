import java.util.Scanner;
class NTest 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("임의의 수를 입력하세요");
		n= sc.nextInt();
		if(n>0){
           System.out.println(n+100);
		   System.out.println("작업종료");
		}
		else{
			System.out.println(n*n);
		   System.out.println("작업종료");
		}
	}
}
