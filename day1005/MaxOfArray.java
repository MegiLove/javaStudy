class MaxOfArray
{
	public static void main(String[] args) 
	{  
		int []arr={9,3,7,15,2};
		int max;
		max=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
				
		}
		System.out.println("max: "+max);
	}
}
