class CallbyReference02 
{
	public static void printArray(int []arr)
   {
	    for(int i=0; i<arr.length; i++)
	   {
		  System.out.printf("%5d",arr[i]);
	   }
	   System.out.println();
   }

    public static void multiOne(int []arr)
    {
	     for(int i=0; i<arr.length; i++)
         {
	     arr[i]= arr[i]*10;
         }
    }
	public static void main(String[] args) 
	{
		int []arr= {10,20,30};
		printArray(arr);
		multiOne(arr);
		printArray(arr);
	}
}
