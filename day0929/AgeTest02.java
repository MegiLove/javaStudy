import java.util.Scanner;
class AgeTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int ageA,ageB;
		System.out.println("A의 나이를 입력하세요");
		ageA=sc.nextInt();
		System.out.println("B의 나이를 입력하세요");
		ageB=sc.nextInt();

		//if(++ageA>=20 & ++ageB>=20)
		if(++ageA>=20 && ++ageB>=20)
         System.out.println("두 사람의 나이를 1씩 증가하면 두 사람 모두 20살 이상입니다");
		else
			System.out.println("두 사람의 나이를 1씩 증가하면 두 사람의 나이는 모두 20살은 아닙니다");
        System.out.println("ageA:"+ageA);
		System.out.println("ageB:"+ageB);
	}
}
