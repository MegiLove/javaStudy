import java.util.Scanner;
class Area{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     int width,length,area;
     System.out.println("사각형의 가로 길이를 입력해주세요");
     width=sc.nextInt();
     System.out.println("사각형의 세로 길이를 입력해주세요");
     length=sc.nextInt();
    area=width*length;
    System.out.println(" **결과 출력** ");
    System.out.println("사각형의 넓이는"+area+"입니다");
    

   }
}