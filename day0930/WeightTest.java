import java.util.Scanner;
class WeightTest 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  double height, weight, psweight;
		System.out.println("Ű�� �Է����ּ���");
	  height=sc.nextDouble();
	  System.out.println("ü���� �Է����ּ���");
	  psweight=sc.nextDouble();
	  weight= (height-100)*0.9;
	  if(psweight<weight)
          System.out.println("��ü���Դϴ�");
	  else if(psweight==weight)
          System.out.println("ǥ���Դϴ�");
	  else if(psweight>weight)
          System.out.println("��ü���Դϴ�");
	}
}