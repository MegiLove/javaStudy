import java.util.Scanner;
class Plus 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int i,n,sum=0;
		System.out.println("1���� � ������ ���ϱ� �ұ��?");
		n=sc.nextInt();
		for(i=1 ;i<=n;i++){sum=sum+i;}
       System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�");
	}
}
