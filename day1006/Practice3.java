import java.util.Scanner;
class Practice3 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.print("N을 입력하세요==> ");
	  int n;
	  n= sc.nextInt();
		int i,j;
		i=1;
        do{
		 j=1;
		 do{
			System.out.printf("*");
			j++;
		 }while(j<=i);
		 System.out.printf("\n");
         i++;
        }while(i<=n);
	}
}
