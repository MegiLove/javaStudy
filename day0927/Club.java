import java.util.Scanner;
class Club{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     String name;     
     int age,height;
     System.out.println("�̸��� �Է����ּ���");
     name=sc.next();
     System.out.println("���̸� �Է����ּ���");
     age=sc.nextInt();
    System.out.println("Ű�� �Է����ּ���");
     height=sc.nextInt();
   
    if(age>=20 && height<=160)
    System.out.println(name+"���� ���尡���Ͻʴϴ� ");
    else
    System.out.println(name+"���� ���� �Ұ����Ͻʴϴ�");
    

   }
}