import java.util.Scanner;
class MonthCalCul
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int month;
		System.out.println("���� �Է����ּ���");
		month= sc.nextInt();
		if(month<1 || month>12){
			System.out.println("�Է°��� �߸��Ǿ����ϴ�");
		}
      if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
        System.out.println(month+"���� 31�ϱ��� �־��!");
	  }
	  if(month==4 || month==6 || month==9 || month==11){
        System.out.println(month+"���� 30�ϱ��� �־��!");
	  }
	  if(month==2){
        System.out.println(month+"���� 28�ϱ��� �־��!");
	  }
	}
}