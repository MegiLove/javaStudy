import java.util.Scanner;
class WeightTest 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  double height, weight, psweight;
		System.out.println("키를 입력해주세요");
	  height=sc.nextDouble();
	  System.out.println("체중을 입력해주세요");
	  psweight=sc.nextDouble();
	  weight= (height-100)*0.9;
	  if(psweight<weight)
          System.out.println("저체중입니다");
	  else if(psweight==weight)
          System.out.println("표준입니다");
	  else if(psweight>weight)
          System.out.println("과체중입니다");
	}
}
