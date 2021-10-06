
class Exam12 
{
	public static void main(String[] args) 
	{   int k,i;
	    boolean isPrime;
		for(k=2; k<=100; k++){
			isPrime = true;
			for(i=2; i<=k-1; i++){
				if(k%i==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)System.out.println(k);
		}
		
		
	}
}
