import java.util.Scanner;
class MonthCalCul
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int month;
		System.out.println("월을 입력해주세요");
		month= sc.nextInt();
		if(month<1 || month>12){
			System.out.println("입력값이 잘못되었습니다");
		}
      if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
        System.out.println(month+"월은 31일까지 있어요!");
	  }
	  if(month==4 || month==6 || month==9 || month==11){
        System.out.println(month+"월은 30일까지 있어요!");
	  }
	  if(month==2){
        System.out.println(month+"월은 28일까지 있어요!");
	  }
	}
}
