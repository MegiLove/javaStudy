import java.util.Scanner;
class HW0927{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
String name;
int computer,clang,eng,math,avg;
System.out.println("당신의 이름을 입력해주세요");
name= sc.next();
System.out.println("컴퓨터 개론 점수를 입력하세요");
computer= sc.nextInt();
System.out.println("C언어 프로그래밍 점수를 입력하세요");
clang= sc.nextInt();
System.out.println("영어 점수를 입력하세요");
eng= sc.nextInt();
System.out.println("일반 수학 점수를 입력하세요");
math= sc.nextInt();
avg= (computer+clang+eng+math)/4;
System.out.println(name+"님의 평균점수는"+avg+"점 입니다");



}
}