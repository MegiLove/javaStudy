import java.util.Scanner;
class Star02 
{
	public static void main(String[] args) 
	{
	  while(true){
	  
	  Scanner sc= new Scanner(System.in);
	  String name;
	  int month,day;
	  System.out.print("�̸��� �Է��ϼ���==> ");
	  name= sc.next();
	  while(true){System.out.print("������ �Է��ϼ���==> ");
		month= sc.nextInt();
		if(month>=1 && month<=12){
			break;
		}
	  }
	    
		switch(month){
		case 1: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
				if(day<=19){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break;
		case 2: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=28){
			break;
		}
		}
			   if(day<=18){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("�������ڸ��Դϴ�");}
					break;
		case 3: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day>=20){System.out.println("�������ڸ��Դϴ�");}
		        else {System.out.println("���ڸ��Դϴ�");}
					break;
		case 4: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=19){System.out.println("���ڸ��Դϴ�");}
		        else {System.out.println("Ȳ���ڸ��Դϴ�");}
					break;
		case 5: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=20){System.out.println("Ȳ���ڸ��Դϴ�");}
		        else {System.out.println("�ֵ����ڸ��Դϴ�");}
					break;
		case 6: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=21){System.out.println("�ֵ����ڸ��Դϴ�");}
		        else {System.out.println("���ڸ��Դϴ�");}
					break;
		case 7: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=22){System.out.println("���ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break;
		case 8: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=22){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("ó���ڸ��Դϴ�");}
					break;
		case 9: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=23){System.out.println("ó���ڸ��Դϴ�");}
		        else {System.out.println("õĪ�ڸ��Դϴ�");}
					break;
		case 10:while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=22){System.out.println("õĪ�ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break;
		case 11: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=30){
			break;
		}
		}
			if(day<=22){System.out.println("�����ڸ��Դϴ�");}
		        else {System.out.println("����ڸ��Դϴ�");}
					break; 
		case 12: while(true){System.out.print("������ �Է��ϼ���==> ");
		day= sc.nextInt(); if(day>=1 && day<=31){
			break;
		}
		}
			if(day<=24){System.out.println("����ڸ��Դϴ�");}
		        else {System.out.println("�����ڸ��Դϴ�");}
					break; 

	}
	char answer;
	   while(true){
	   System.out.println("�� �Ͻðھ��?(y/n)");
	   answer= sc.next().charAt(0);
	  if(answer=='y' || answer=='n') {break;} 
	  }
	  
      if(answer=='n'){System.out.println("�����մϴ�");break;}
	  
   
	  }
		  }
      
	  
}
	  
	
