import java.util.Scanner;
class Star 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	String name;
	int month;
	int day;
	    System.out.println("�̸��� �Է����ּ���");
		name= sc.next();
		System.out.println("������ �Է����ּ���");
		month= sc.nextInt();
		if(month<1 || month>12){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
		System.out.println("������ �Է����ּ���");
		day= sc.nextInt();
	   switch(month){
		case 1: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
				if(day<=19){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break;
		case 2:if(day<1 || day>28){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		} 
			   if(day<=18){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("�������ڸ��Դϴ�");}
					break;
		case 3: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day>=20){System.out.println("�������ڸ��Դϴ�");}
		        else {System.out.println("���ڸ��Դϴ�");}
					break;
		case 4: if(day<1 || day>30){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=19){System.out.println("���ڸ��Դϴ�");}
		        else {System.out.println("Ȳ���ڸ��Դϴ�");}
					break;
		case 5: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=20){System.out.println("Ȳ���ڸ��Դϴ�");}
		        else {System.out.println("�ֵ����ڸ��Դϴ�");}
					break;
		case 6: if(day<1 || day>30){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=21){System.out.println("�ֵ����ڸ��Դϴ�");}
		        else {System.out.println("���ڸ��Դϴ�");}
					break;
		case 7: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=22){System.out.println("���ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break;
		case 8: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=22){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("ó���ڸ��Դϴ�");}
					break;
		case 9: if(day<1 || day>30){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=23){System.out.println("ó���ڸ��Դϴ�");}
		        else {System.out.println("õĪ�ڸ��Դϴ�");}
					break;
		case 10: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=22){System.out.println("õĪ�ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break;
		case 11: if(day<1 || day>30){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=22){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("����ڸ��Դϴ�");}
					break; 
		case 12: if(day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�");
			return;
		}
			if(day<=24){System.out.println("����ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break; 
		

	   }
	
}
}