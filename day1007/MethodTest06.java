class MyUtil
{
  void array(int []data, int []data2){
		boolean flag= true;
		if(data.length!=data2.length{
			System.out.println("두 배열의 길이가 다릅니다"); return;
		}

		for (int i=0; i<data.length; i++)
		{ 
			if(data[i]!=data2[i]){ flag= false; break;}
		}

	    if(flag){
			System.out.println("두 배열의 값은 동일합니다");
		}
	    else{
			System.out.println("두 배열의 값은 동일하지 않습니다");
		}
	}
}

class MethodTest06 
{
	public static void main(String[] args) 
	{   
		int []a= {10,20,30,40,50,60,70,80};
		int []b= {10,20,30,40,50,60,70,80};
		MyUtil mu= new MyUtil();
		mu.array(a,b);
	}
}
