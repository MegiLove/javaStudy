import java.util.Scanner;
import java.util.Date;
class CancerTest03{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     Date today= new Date();
     String name;     
     int birth,age;
     int thisYear;
     thisYear= today.getYear()+1900;
     System.out.println("�̸��� �Է����ּ���");
     name=sc.next();
     System.out.println("��������� �Է����ּ���");
     birth=sc.nextInt();
    age=thisYear-birth;
    System.out.println("���ش�"+thisYear+ "�⵵�Դϴ�");
    if(age>=40)
    System.out.println(name+"���� ����"+ age+"�� �Դϴ�. ����ϰ��� ������̽ʴϴ� ");
    else
    System.out.println(name+"���� ����"+ age+"�� �Դϴ�. ����ϰ��� ����ڰ� �ƴϽʴϴ�");
    

   }
}