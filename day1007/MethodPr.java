class MyUtil
{ 

  void maxmin(int a,int b){
	if(a>b){
		System.out.println(a);}
		else{
			System.out.println(b);}
  }
}

class MethodPr 
{
	public static void main(String[] args) 
	{   
		int age1= 26;
		int age2= 28;
		MyUtil mu= new MyUtil();
		mu.maxmin(age1,age2);
	}
}