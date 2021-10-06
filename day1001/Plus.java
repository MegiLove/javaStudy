import java.util.Scanner;
class Plus 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int i,n,sum=0;
		System.out.println("1부터 어떤 수까지 더하기 할까요?");
		n=sc.nextInt();
		for(i=1 ;i<=n;i++){sum=sum+i;}
       System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");
	}
}
