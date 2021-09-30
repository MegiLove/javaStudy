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
     System.out.println("이름을 입력해주세요");
     name=sc.next();
     System.out.println("출생연도를 입력해주세요");
     birth=sc.nextInt();
    age=thisYear-birth;
    System.out.println("올해는"+thisYear+ "년도입니다");
    if(age>=40)
    System.out.println(name+"님은 올해"+ age+"세 입니다. 무료암검진 대상자이십니다 ");
    else
    System.out.println(name+"님은 올해"+ age+"세 입니다. 무료암검진 대상자가 아니십니다");
    

   }
}