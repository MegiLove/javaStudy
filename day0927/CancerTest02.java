import java.util.Scanner;
class CancerTest02{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     String name;     
     int birth,age;
     System.out.println("이름을 입력해주세요");
     name=sc.next();
     System.out.println("출생연도를 입력해주세요");
     birth=sc.nextInt();
    age=2021-birth;
    if(age>=40)
    System.out.println(name+"님은 올해"+ age+"세 입니다. 무료암검진 대상자이십니다 ");
    else
    System.out.println(name+"님은 올해"+ age+"세 입니다. 무료암검진 대상자가 아니십니다");
    

   }
}