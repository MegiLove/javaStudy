import java.util.Scanner;
class Practice3_2 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.print("N을 입력하세요==> ");
	  int n;
	  n= sc.nextInt();
	  int i,j;
      for(i=1; i<=n; i++){
		for(j=1; j<=i; j++){
		System.out.printf("*");	
		}
       System.out.printf("\n");
      }

	}
}

