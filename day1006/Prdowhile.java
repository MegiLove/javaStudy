import java.util.Scanner;
class Prdowhile 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
	  int k;
	  System.out.print("�ټ��� �Է��ϼ���==> ");
	  n= sc.nextInt();
      System.out.print("ĭ���� �Է��ϼ���==> ");
	  k= sc.nextInt();
	  int j;
	  int i=1;
	  do{ 
		j=1;
		do{
			System.out.print("*");
			j++;
		}while(j<=k);
        System.out.println(); 
		i++;
      

	}while(i<=n);
}
}
