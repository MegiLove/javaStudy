import java.util.Scanner;
class Calculate{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     int a,b,plus,minus,multi,divi;
     System.out.println("���� a�� �Է����ּ���");
     a=sc.nextInt();
     System.out.println("���� b�� �Է����ּ���");
     b=sc.nextInt();
     plus= a+b;
     minus= a-b;
     multi= a*b;
     divi= a/b;
    System.out.println(" **��� ���** ");
    System.out.println("����:"+plus);
    System.out.println("����:"+minus);
    System.out.println("����:"+multi);
    System.out.println("������:"+divi);

   }
}