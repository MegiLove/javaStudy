import java.util.Scanner;
import java.util.Date;
class CancerTest
{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
	 Date today= new Date();
     String name;
	 int birth;
	System.out.println("이름을 입력하세요");
	name= sc.next();
    System.out.println("출생연도를 입력하세요");
	birth= sc.nextInt();
	int thisYear= today.getYear()+1900;
	int age= thisYear-birth;
	if(age>=40 && age<50 && thisYear%2==birth%2){
	System.out.println("무료암검진 대상자입니다 암검진 항목은 위암, 간암입니다");
	}
	if(age>=50 && thisYear%2==birth%2){
	System.out.println("무료암검진 대상자입니다 암검진 항목은 위암, 간암, 대장암입니다");
	}
	
	if(age<40 || thisYear%2!=birth%2){
	System.out.println("무료암검진 대상자가 아닙니다");
	}
}
}