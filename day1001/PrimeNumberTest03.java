import java.util.Scanner;
class PrimeNumberTest03
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
	  boolean flag= true;
		System.out.println("N�� �Է����ּ���");
	    n= sc.nextInt();
		
		for(int i=2; i<n; i++){
			if(n%i==0){
				flag= false;
				break;

				//break���
			}
		}
		//if(flag)
	  if (flag==true){
		System.out.println(n+"�� �Ҽ��Դϴ�");
	  } else{
         System.out.println(n+"�� �Ҽ��� �ƴմϴ�");}
	}

}