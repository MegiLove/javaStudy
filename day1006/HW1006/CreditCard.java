import java.util.Scanner;
class CreditCard
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in); 
	  double []money= new double[12];
	  for(int i=0; i<=11; i++){
	  while(true){
	  System.out.println((i+1)+"�� ��� �ݾ��� �Է��ϼ���");
	  money[i]= sc.nextInt();
	  if(money[i]>0) break;
	  }
	  }
	  double sum=0;
	  for(int i=0; i<=11; i++){sum+=money[i];}
	System.out.println("1�⵿���� ��ü ��� �ݾ���"+sum+"�� �Դϴ�");
	System.out.println("���� ��� ��� �ݾ���"+sum/12+"�� �Դϴ�");
   double max= money[0];
	for(int i=1; i<=11; i++){
		if(max<money[i]){
			max= money[i];
		}
    }
    System.out.println("���� ������ ���Ҵ� ����"+max+"�� �Դϴ�");
    double min= money[0];
	for(int i=1; i<=11; i++){
		if(min>money[i]){
			min= money[i];
		}
    }
	System.out.println("���� ������ ������ ����"+min+"�� �Դϴ�");
	  
	}
}
