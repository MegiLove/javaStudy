import java.util.Scanner;
class Star 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	String name;
	int month;
	int day;
	    System.out.println("이름을 입력해주세요");
		name= sc.next();
		System.out.println("생월을 입력해주세요");
		month= sc.nextInt();
		if(month<1 || month>12){
			System.out.println("잘못된 입력값입니다");
			return;
		}
		System.out.println("생일을 입력해주세요");
		day= sc.nextInt();
	   switch(month){
		case 1: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
				if(day<=19){System.out.println("염소자리입니다");}
		        else {System.out.println("물병자리입니다");}
					break;
		case 2:if(day<1 || day>28){
			System.out.println("잘못된 입력값입니다");
			return;
		} 
			   if(day<=18){System.out.println("물병자리입니다");}
		        else {System.out.println("물고기자리입니다");}
					break;
		case 3: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day>=20){System.out.println("물고기자리입니다");}
		        else {System.out.println("양자리입니다");}
					break;
		case 4: if(day<1 || day>30){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=19){System.out.println("양자리입니다");}
		        else {System.out.println("황소자리입니다");}
					break;
		case 5: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=20){System.out.println("황소자리입니다");}
		        else {System.out.println("쌍둥이자리입니다");}
					break;
		case 6: if(day<1 || day>30){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=21){System.out.println("쌍둥이자리입니다");}
		        else {System.out.println("게자리입니다");}
					break;
		case 7: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=22){System.out.println("게자리입니다");}
		        else {System.out.println("사자자리입니다");}
					break;
		case 8: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=22){System.out.println("사자자리입니다");}
		        else {System.out.println("처녀자리입니다");}
					break;
		case 9: if(day<1 || day>30){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=23){System.out.println("처녀자리입니다");}
		        else {System.out.println("천칭자리입니다");}
					break;
		case 10: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=22){System.out.println("천칭자리입니다");}
		        else {System.out.println("전갈자리입니다");}
					break;
		case 11: if(day<1 || day>30){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=22){System.out.println("전갈자리입니다");}
		        else {System.out.println("사수자리입니다");}
					break; 
		case 12: if(day<1 || day>31){
			System.out.println("잘못된 입력값입니다");
			return;
		}
			if(day<=24){System.out.println("사수자리입니다");}
		        else {System.out.println("염소자리입니다");}
					break; 
		

	   }
	
}
}
