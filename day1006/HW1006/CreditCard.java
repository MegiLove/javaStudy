import java.util.Scanner;
class CreditCard
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in); 
	  double []money= new double[12];
	  for(int i=0; i<=11; i++){
	  while(true){
	  System.out.println((i+1)+"월 사용 금액을 입력하세요");
	  money[i]= sc.nextInt();
	  if(money[i]>0) break;
	  }
	  }
	  double sum=0;
	  for(int i=0; i<=11; i++){sum+=money[i];}
	System.out.println("1년동안의 전체 사용 금액은"+sum+"원 입니다");
	System.out.println("월별 평균 사용 금액은"+sum/12+"원 입니다");
   double max= money[0];
	for(int i=1; i<=11; i++){
		if(max<money[i]){
			max= money[i];
		}
    }
    System.out.println("가장 지출이 많았던 월은"+max+"월 입니다");
    double min= money[0];
	for(int i=1; i<=11; i++){
		if(min>money[i]){
			min= money[i];
		}
    }
	System.out.println("가장 지출이 적었던 월은"+min+"월 입니다");
	  
	}
}
