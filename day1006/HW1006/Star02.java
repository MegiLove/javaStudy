import java.util.Scanner;
class Star02 
{
	public static void main(String[] args) 
	{
	  while(true){
	  
	  Scanner sc= new Scanner(System.in);
	  String name;
	  int month,day;
	  System.out.print("이름을 입력하세요==> ");
	  name= sc.next();
	  while(true){System.out.print("생월을 입력하세요==> ");
		month= sc.nextInt();
		if(month>=1 && month<=12){
			break;
		}
	  }
	    
		switch(month){
		case 1: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
				if(day<=19){System.out.println("염소자리입니다");}
		        else {System.out.println("물병자리입니다");}
					break;
		case 2: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=28){
			break;
		}
		}
			   if(day<=18){System.out.println("물병자리입니다");}
		        else {System.out.println("물고기자리입니다");}
					break;
		case 3: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day>=20){System.out.println("물고기자리입니다");}
		        else {System.out.println("양자리입니다");}
					break;
		case 4: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=19){System.out.println("양자리입니다");}
		        else {System.out.println("황소자리입니다");}
					break;
		case 5: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=20){System.out.println("황소자리입니다");}
		        else {System.out.println("쌍둥이자리입니다");}
					break;
		case 6: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=21){System.out.println("쌍둥이자리입니다");}
		        else {System.out.println("게자리입니다");}
					break;
		case 7: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=22){System.out.println("게자리입니다");}
		        else {System.out.println("사자자리입니다");}
					break;
		case 8: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=22){System.out.println("사자자리입니다");}
		        else {System.out.println("처녀자리입니다");}
					break;
		case 9: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=23){System.out.println("처녀자리입니다");}
		        else {System.out.println("천칭자리입니다");}
					break;
		case 10:while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=22){System.out.println("천칭자리입니다");}
		        else {System.out.println("전갈자리입니다");}
					break;
		case 11: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=22){System.out.println("전갈자리입니다");}
		        else {System.out.println("사수자리입니다");}
					break; 
		case 12: while(true){System.out.print("생일을 입력하세요==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=24){System.out.println("사수자리입니다");}
		        else {System.out.println("염소자리입니다");}
					break; 

	}
	char answer;
	   while(true){
	   System.out.println("또 하시겠어요?(y/n)");
	   answer= sc.next().charAt(0);
	  if(answer=='y' || answer=='n') {break;} 
	  }
	  
      if(answer=='n'){System.out.println("종료합니다");break;}
	  
   
	  }
		  }
      
	  
}
	  
	

