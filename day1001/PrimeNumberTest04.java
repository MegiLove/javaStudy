import java.util.Scanner;
class PrimeNumberTest04
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
		System.out.println("N�� �Է����ּ���");
	    n= sc.nextInt();
		int i;
		for(i=2; i<n; i++){
			if(n%i==0){
				break;
			}
		}
	  if (i==n){
		System.out.println(n+"�� �Ҽ��Դϴ�");
	  } else{
         System.out.println(n+"�� �Ҽ��� �ƴմϴ�");}
	}

}
