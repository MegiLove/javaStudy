import java.util.Scanner;
class CancerTest02{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     String name;     
     int birth,age;
     System.out.println("�̸��� �Է����ּ���");
     name=sc.next();
     System.out.println("��������� �Է����ּ���");
     birth=sc.nextInt();
    age=2021-birth;
    if(age>=40)
    System.out.println(name+"���� ����"+ age+"�� �Դϴ�. ����ϰ��� ������̽ʴϴ� ");
    else
    System.out.println(name+"���� ����"+ age+"�� �Դϴ�. ����ϰ��� ����ڰ� �ƴϽʴϴ�");
    

   }
}