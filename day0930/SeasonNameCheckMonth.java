import java.util.Scanner;
class SeasonNameCheckMonth
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	 int month;
		System.out.println("월을 입력해주세요");
        month= sc.nextInt();
	 if(month>=1 && month<=12){
      if(month>=3 && month<6){
		 System.out.println(month+"월은 봄입니다"); 
	  }
	  else if(month>=6 && month<9){
		 System.out.println(month+"월은 여름입니다"); 
	  }
	  else if(month>=9 && month<12){
		 System.out.println(month+"월은 가을입니다"); 
	  }
	  else{
		 System.out.println(month+"월은 겨울입니다"); 
	  }
	}
	else{System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
}
}
}