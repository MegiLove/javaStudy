import java.util.Scanner;
class Plus
{
	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
        int i=1;
		int sum=0;
		int n;
		System.out.println("1���� � ������ ���ұ��?");
        n= sc.nextInt();
		for(i=1;i<=n ;i++){ 
			sum+=i;
		}
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�");
	}
}
