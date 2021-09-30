import java.util.Scanner;
class AgeTest 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int ageA,ageB;
		System.out.println("A의 나이를 입력하세요");
		ageA=sc.nextInt();
		System.out.println("B의 나이를 입력하세요");
		ageB=sc.nextInt();

		if(ageA>=20 & ageB>=20)
         System.out.println("두 사람은 모두 20살입니다");
		else
			System.out.println("두 사람은 20살이 아닙니다");

	}
}
