import java.util.Scanner;
class Lab1 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);  
	  System.out.println("������ �Է��ϼ���");
	  int score;
	  score= sc.nextInt();

	  if(score<50)
      System.out.println("���հ��Դϴ�");
	  else if(score>=50 && score<60)
	  System.out.println("��Ÿ���� ���հ��Դϴ�");
	  else if(score>=60 && score<70)
	  System.out.println("�հ��Դϴ�");
	  else if(score>=70 && score<80)
	  System.out.println("����ϰ� �հ��Ͽ����ϴ�");
	  else if(score>=80)
	  System.out.println("���� ����ϰ� �հ��Ͽ����ϴ�");
	}
}