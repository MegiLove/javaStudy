import java.util.Scanner;
class InputInt02
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
        double a,b,c;
		System.out.println("숫자 세 개를 입력해주세요");
		a= sc.nextDouble();
		b= sc.nextDouble();
		c= sc.nextDouble();

		if(a>b && a>c){
		System.out.println("가장 큰 수는"+a);
		}
		else if(b>a && b>c){
		System.out.println("가장 큰 수는"+b);
		}
		else if(c>a && c>b){
		System.out.println("가장 큰 수는"+c);
		}
		
	}
}
