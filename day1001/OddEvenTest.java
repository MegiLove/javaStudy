import java.util.Scanner;
class OddEvenTest
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		int i,n,sum1=0,sum2=0,sum3=0,sum4=0;
		System.out.println("N�� �Է��ϼ���");
        n= sc.nextInt();
        for(i=2; i<=n; i=i+2){
		sum1=sum1+i;}
        System.out.println("¦���� ��: "+sum1);

        for(i=1; i<=n; i=i+2){
		sum2=sum2+i;}
        System.out.println("Ȧ���� ��: "+sum2);

	    for(i=2; i<=n; i=i+2){
		if(i%2==0) sum3=sum3+1;
		}
        System.out.println("¦���� ����: "+sum3);

		for(i=1; i<=n; i=i+2){
		if(i%2==1) sum4=sum4+1;
		}
        System.out.println("Ȧ���� ����: "+sum4);

      }
	
	}

