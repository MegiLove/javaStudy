class CallbyValueTest 
{
	public static void plusOne(int n)
	{
		n=n+1;
		System.out.println(n); //101
	}
	
	public static void main(String[] args) 
	{
		int data=100;
		plusOne(data); //메소드호출문
		System.out.println(data); //100
	}
}
