import java.util.Scanner;
class Calcul 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.print("ù��° ������ �Է��ϼ��� ");
		a= sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� ");
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
