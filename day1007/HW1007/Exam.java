import java.util.Scanner;
class MyUtil
{ 
	int correctAnswers(char data[], char data2[])
    {   int correctanswers=0;
	    for (int i=0; i<=9; i++)
	    {
			if(data[i]==data2[i]) correctanswers++;   
	    }
	    return correctanswers;
	}
   int incorrectAnswers(char data[], char data2[])
    {   int incorrectanswers=0;
	    for (int i=0; i<=9; i++)
	    {
			if(data[i]!=data2[i]) incorrectanswers++;   
	    }
	    return incorrectanswers;
	}

	boolean isPassed(int correctanswers)
    {   boolean flag= true;
		if(correctanswers<7)
		{ 
		  flag= false; 
        }
		return flag;
    }
}



class Exam
{
	public static void main(String[] args) 
	{   Scanner sc= new Scanner(System.in);
		String []quest= new String[10];
		char []canswer= {'a','b','c','d','a','b','c','d','a','b'};
		char []sanswer= new char[10];
        for (int i=0; i<=9; i++)
        {
			System.out.println((i+1)+"번째 문제의 답은?");
			sanswer[i]= sc.next().charAt(0);	 
        }

        MyUtil mu= new MyUtil();
        int c=mu.correctAnswers(canswer, sanswer);	
        int i=mu.incorrectAnswers(canswer, sanswer);
       
	   if(mu.isPassed(c)){
		    System.out.println("시험을 통과하였습니다");
	   }
       else{
		    System.out.println("시험에 탈락하였습니다");
       }
		
    }
       
		
}

