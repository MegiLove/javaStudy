import java.util.Scanner;
class Gugudan 
{
	public static void main(String[] args) 
	{ 
	  Scanner sc= new Scanner(System.in);
	  int g,i;
	  int sum;
	System.out.println("구구단 중 몇단을 출력할까요?");
     g= sc.nextInt();
	 for(i=1;i<=9 ;i++ ){ sum=g*i;
		 System.out.println(g+"*"+i+"="+sum);}
	

	}
}
