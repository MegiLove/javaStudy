import java.util.Scanner;
class HW0927{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
String name;
int computer,clang,eng,math,avg;
System.out.println("����� �̸��� �Է����ּ���");
name= sc.next();
System.out.println("��ǻ�� ���� ������ �Է��ϼ���");
computer= sc.nextInt();
System.out.println("C��� ���α׷��� ������ �Է��ϼ���");
clang= sc.nextInt();
System.out.println("���� ������ �Է��ϼ���");
eng= sc.nextInt();
System.out.println("�Ϲ� ���� ������ �Է��ϼ���");
math= sc.nextInt();
avg= (computer+clang+eng+math)/4;
System.out.println(name+"���� ���������"+avg+"�� �Դϴ�");



}
}