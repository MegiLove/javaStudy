import java.util.Scanner;
class Scholarship 
{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
		String name;
		int kor,eng,math,avg;
		
		System.out.println("이름을 입력해주세요");
		name= sc.next();
		System.out.println("국어점수를 입력해주세요");
		kor= sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng= sc.nextInt();
        System.out.println("수학점수를 입력해주세요");
		math= sc.nextInt();
        avg= (kor+eng+math)/3;
		if(avg>=90&& kor>=90)
			System.out.println("장학금을 지급합니다");
		else
            System.out.println("장학금 지급 대상자가 아닙니다");

	}
}
