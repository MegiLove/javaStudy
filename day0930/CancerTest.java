import java.util.Scanner;
import java.util.Date;
class CancerTest
{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
	 Date today= new Date();
     String name;
	 int birth;
	System.out.println("�̸��� �Է��ϼ���");
	name= sc.next();
    System.out.println("��������� �Է��ϼ���");
	birth= sc.nextInt();
	int thisYear= today.getYear()+1900;
	int age= thisYear-birth;
	if(age>=40 && age<50 && thisYear%2==birth%2){
	System.out.println("����ϰ��� ������Դϴ� �ϰ��� �׸��� ����, �����Դϴ�");
	}
	if(age>=50 && thisYear%2==birth%2){
	System.out.println("����ϰ��� ������Դϴ� �ϰ��� �׸��� ����, ����, ������Դϴ�");
	}
	
	if(age<40 || thisYear%2!=birth%2){
	System.out.println("����ϰ��� ����ڰ� �ƴմϴ�");
	}
}
}