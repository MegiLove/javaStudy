import java.util.Scanner;
class Practice3_3
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.print("N�� �Է��ϼ���==> ");
	  int n;
	  n= sc.nextInt();
		int i,j;
		i=1;
		while(i<=n){
			j=1;
			while(j<=i){System.out.printf("*");
			j++;}
			System.out.printf("\n");
            i++;
		}
	}
}
