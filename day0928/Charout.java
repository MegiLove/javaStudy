import java.util.Scanner;
class Charout
{
public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
        String a;
		System.out.println("문자열을 입력하세요");
		a= sc.next();
		//char first= a.charAt(0);
		String first= a. substring(0,1);
        System.out.println("문자열의 첫 문자는 "+ first+ "입니다");
	
	
	}
}
