import java.util.Scanner;
class StudentScore02
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int korscore[]= new int[5];
	  int engscore[]= new int[5];
	  int mathscore[]= new int[5];
	  String name[]= new String[5];
	  for(int i=0; i<korscore.length; i++){
		System.out.println((i+1)+"번째 학생의 이름");
		name[i]= sc.next();
		System.out.println((i+1)+"번째 학생의 국어점수");
		korscore[i]= sc.nextInt();
		
		System.out.println((i+1)+"번째 학생의 영어점수");
		engscore[i]= sc.nextInt();
	
		System.out.println((i+1)+"번째 학생의 수학점수");
		mathscore[i]= sc.nextInt();}
        
		double avg[]=new double [5];
		for(int i=0; i<korscore.length; i++){
		avg[i]= (korscore[i]+engscore[i]+mathscore[i])/3;		
		}
	    
		
		for(int i=0; i<avg.length; i++){
			for(int j= i+1; j<avg.length; j++){
			if(avg[j] >avg[i]){
				double temp= avg[i];
				avg[i]=avg[j];
				avg[j]=temp;
				String temp2= name[i];
				name[i]=name[j];
				name[j]=temp2;
			}
			}

		
	}

	System.out.println("** 성적순 정렬 **");
    for(int i=0; i<avg.length; i++){
		System.out.println(name[i]+" "+avg[i]);}

}
}
