import java.util.Scanner;
class Club{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     String name;     
     int age,height;
     System.out.println("이름을 입력해주세요");
     name=sc.next();
     System.out.println("나이를 입력해주세요");
     age=sc.nextInt();
    System.out.println("키를 입력해주세요");
     height=sc.nextInt();
   
    if(age>=20 && height<=160)
    System.out.println(name+"님은 입장가능하십니다 ");
    else
    System.out.println(name+"님은 입장 불가능하십니다");
    

   }
}