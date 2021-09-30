import java.util.Scanner;
class Calcul 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 정수를 입력하세요 ");
		a= sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 ");
		b= sc.nextInt();
		int add= a+b;
		int sub= a-b;
		int multi= a*b;
        int div= a/b;
		int mode= a%b;
        System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
        System.out.println(a+"%"+b+"="+mode);
        

	}
}
