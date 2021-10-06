class AvgAge 
{
	public static void main(String[] args) 
	{  int i,sum=0;
		int[]age={27,28,26,29,28};
	  for(i=0; i<age.length; i++){
		sum+=age[i];
			
	  }

	  double avg= (double)sum/age.length;
		System.out.println(avg);
	}
}
