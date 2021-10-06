import java.util.Scanner;
class Lab2 
{
	public static void main(String[] args) 
	{   Scanner sc= new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		char a;
		a= sc.next().charAt(0);
		switch(a){
		case 'a': System.out.println("입력된 문자"+a+"는 모음입니다"); break;
		case 'e': System.out.println("입력된 문자"+a+"는 모음입니다"); break;
		case 'i': System.out.println("입력된 문자"+a+"는 모음입니다"); break;
		case 'o': System.out.println("입력된 문자"+a+"는 모음입니다"); break;
		case 'u': System.out.println("입력된 문자"+a+"는 모음입니다"); break;
        default : System.out.println("입력된 문자"+a+"는 비모음입니다"); 
		}

	}
}
