import java.util.Scanner;
class CalculX{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     double x, calculate;
     System.out.println("�Ǽ� x�� �Է����ּ���");
     x=sc.nextDouble();
     //calculate= 3*x*x*x-7*x*x+9;
    calculate= 3*Math.pow(x,3)- 7*Math.pow(x,2)+9;
    System.out.println("���׽��� ����"+calculate+"�Դϴ�");
    

   }
}