import java.util.Scanner;
class StudentTest

{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		
		System.out.println("이름을 입력해주세요");
		name= sc.next();
		System.out.println("국어점수를 입력해주세요");
		kor= sc.nextInt();
		System.out.println("영어점수를 입력해주세요");
		eng= sc.nextInt();
        System.out.println("수학점수를 입력해주세요");
		math= sc.nextInt();
        tot= kor+eng+math;
	    avg= tot/3;
	    System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);
		if(avg>=60)
			System.out.println("합격입니다");
		else
            System.out.println("불합격입니다");


   


	}
}
