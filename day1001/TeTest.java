import java.util.Scanner;
class TeTest 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
	  int i,cnt=0;
     int []test= new int[10];
	 for(i=0;i<test.length; i++){test[i]=1;}
	 int []answer= new int[10];
		
	 for(i=0; i<test.length; i++){
		System.out.print((i+1)+"번 답을 입력하세요==> ");
		 n= sc.nextInt();
		 answer[i]=n;
		 
	 }
		
        
		for(i=0; i<answer.length; i++){
		if(test[i]==answer[i])
		{
			System.out.println((i+1)+"번: O");
				cnt=cnt+1;	

		}
		else
          {System.out.println((i+1)+"번: X");
		}
		}
		
		int cnt1= answer.length-cnt;
		System.out.println("맞은 개수: "+cnt);
		System.out.println("틀린 개수: "+cnt1);
		}


		}
		 		     
	

