import java.util.Scanner;
class Season4 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	int month;
		System.out.println("월을 입력해주세요");
		month= sc.nextInt();
		if(month<1 || month>12)
          System.out.println("잘못된 입력값입니다");
		  
		else{
		switch(month){
		case 1: System.out.println("겨울입니다");break;
		case 2: System.out.println("겨울입니다");break;
		case 3: System.out.println("봄입니다");break;
		case 4: System.out.println("봄입니다");break;
		case 5: System.out.println("봄입니다");break;
		case 6: System.out.println("여름입니다");break;
		case 7: System.out.println("여름입니다");break;
		case 8: System.out.println("여름입니다");break;
		case 9: System.out.println("가을입니다");break;
		case 10: System.out.println("가을입니다");break;
		case 11: System.out.println("가을입니다");break;
		case 12: System.out.println("겨울입니다");break;
		}
		}
	}
}
