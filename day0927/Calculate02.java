import java.util.Scanner;
class Calculate02{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     int a,b;
     System.out.println("���� a�� �Է����ּ���");
     a=sc.nextInt();
     System.out.println("���� b�� �Է����ּ���");
     b=sc.nextInt();
     
    System.out.println(" **��� ���** ");
    System.out.println("����:"+(a+b));
    System.out.println("����:"+(a-b));
    System.out.println("����:"+(a*b));
    System.out.println("������:"+(a/b));

   }
}