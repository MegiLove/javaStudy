import java.util.Scanner;
class Season4 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	int month;
		System.out.println("���� �Է����ּ���");
		month= sc.nextInt();
		if(month<1 || month>12)
          System.out.println("�߸��� �Է°��Դϴ�");
		  
		else{
		switch(month){
		case 1: System.out.println("�ܿ��Դϴ�");break;
		case 2: System.out.println("�ܿ��Դϴ�");break;
		case 3: System.out.println("���Դϴ�");break;
		case 4: System.out.println("���Դϴ�");break;
		case 5: System.out.println("���Դϴ�");break;
		case 6: System.out.println("�����Դϴ�");break;
		case 7: System.out.println("�����Դϴ�");break;
		case 8: System.out.println("�����Դϴ�");break;
		case 9: System.out.println("�����Դϴ�");break;
		case 10: System.out.println("�����Դϴ�");break;
		case 11: System.out.println("�����Դϴ�");break;
		case 12: System.out.println("�ܿ��Դϴ�");break;
		}
		}
	}
}