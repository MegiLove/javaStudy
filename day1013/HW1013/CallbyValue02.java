class CallbyValue02
{
	public static void multi(int a)
	{
		a= a*10;
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		int num=5;
		multi(num); //50
		System.out.println(num); //5
	}
}
