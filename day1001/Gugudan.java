import java.util.Scanner;
class Gugudan 
{
	public static void main(String[] args) 
	{ 
	  Scanner sc= new Scanner(System.in);
	  int g,i;
	  int sum;
	System.out.println("������ �� ����� ����ұ��?");
     g= sc.nextInt();
	 for(i=1;i<=9 ;i++ ){ sum=g*i;
		 System.out.println(g+"*"+i+"="+sum);}
	

	}
}