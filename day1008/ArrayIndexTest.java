class ArrayIndexTest 
{
	public static void main(String[] args) 
	{
		int []arr= new int[5];
		//사용할 수 있는 인덱스의 범위0,1,2,3,4
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);//배열의 범위를 넘었다는 "예외(Exception)"가 발생한다
	}
}

/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayIndexTest.main(ArrayIndexTest.java:12)*/

		/*
		int []data= {1,2,3,4,5};
		for(int i:data)//==> for-each 반복문에서 i는 배열의 값을 하나씩 꺼내온다
		{
			System.out.println(i)// 이거는 출력하면 값을 하나씩 들고오니 정상적으로 1,2,3,4,5가 출력된다
			System.out.println(data[i])//i자체가 배열의 값을 갖고 오는데 그걸 인덱스로 쓰고있다 이거는 출력하면 data[0]이 아닌 data[1]
			                            //부터 출력하니 2,3,4,5
		}*/