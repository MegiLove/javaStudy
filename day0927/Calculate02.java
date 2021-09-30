import java.util.Scanner;
class Calculate02{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     int a,b;
     System.out.println("Á¤¼ö a¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
     a=sc.nextInt();
     System.out.println("Á¤¼ö b¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
     b=sc.nextInt();
     
    System.out.println(" **°á°ú Ãâ·Â** ");
    System.out.println("µ¡¼À:"+(a+b));
    System.out.println("»¬¼À:"+(a-b));
    System.out.println("°ö¼À:"+(a*b));
    System.out.println("³ª´°¼À:"+(a/b));

   }
}