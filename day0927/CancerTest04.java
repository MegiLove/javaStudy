import java.util.Scanner;
import java.util.Date;
class CancerTest04{
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
   
    if(age>=40 && birth %2 == thisYear%2)
    System.out.println(name+"���� "+ birth+"����̽ʴϴ�. ����ϰ��� ������̽ʴϴ� ");
    else
    System.out.println(name+"���� "+ birth+"����̽ʴϴ�. ����ϰ��� ����ڰ� �ƴϽʴϴ�");
    

   }
}