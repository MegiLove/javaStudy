import java.util.Scanner;
class Smaller
{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
     int a,b;
	System.out.println("정수 a를 입력해주세요");
	a= sc.nextInt();
    System.out.println("정수 b를 입력해주세요");
	b= sc.nextInt();
	if(a>b)
		System.out.println("작은 수는" +b+"입니다");
	if(a<b)
        System.out.println("작은 수는" +a+"입니다");
	if(a==b)
		System.out.println("두 수는 같습니다");
	}
}
