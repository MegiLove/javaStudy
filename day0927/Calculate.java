import java.util.Scanner;
class Calculate{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     int a,b,plus,minus,multi,divi;
     System.out.println("Á¤¼ö a¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
     a=sc.nextInt();
     System.out.println("Á¤¼ö b¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
     b=sc.nextInt();
     plus= a+b;
     minus= a-b;
     multi= a*b;
     divi= a/b;
    System.out.println(" **°á°ú Ãâ·Â** ");
    System.out.println("µ¡¼À:"+plus);
    System.out.println("»¬¼À:"+minus);
    System.out.println("°ö¼À:"+multi);
    System.out.println("³ª´°¼À:"+divi);

   }
}