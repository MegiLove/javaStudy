import java.util.Scanner;
class Threehang 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("임의의 수를 입력해주세요");
		n=sc.nextInt();
        System.out.println((n%2==0)?"짝수입니다":"홀수입니다");
	}
}
