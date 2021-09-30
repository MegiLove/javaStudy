import java.util.Scanner;
class Exam03 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int g=454;
		double weight;

		System.out.println("몸무게를 파운드로 입력해주세요");
		weight= sc.nextDouble();
		weight *= g;
        System.out.println("당신의 몸무게는"+weight+"g입니다");
	}
}
