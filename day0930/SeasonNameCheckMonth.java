import java.util.Scanner;
class SeasonNameCheckMonth
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	 int month;
		System.out.println("���� �Է����ּ���");
        month= sc.nextInt();
	 if(month>=1 && month<=12){
      if(month>=3 && month<6){
		 System.out.println(month+"���� ���Դϴ�"); 
	  }
	  else if(month>=6 && month<9){
		 System.out.println(month+"���� �����Դϴ�"); 
	  }
	  else if(month>=9 && month<12){
		 System.out.println(month+"���� �����Դϴ�"); 
	  }
	  else{
		 System.out.println(month+"���� �ܿ��Դϴ�"); 
	  }
	}
	else{System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
}
}
}