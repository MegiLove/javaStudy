class ArrayIndexTest 
{
	public static void main(String[] args) 
	{
		int []arr= new int[5];
		//����� �� �ִ� �ε����� ����0,1,2,3,4
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);//�迭�� ������ �Ѿ��ٴ� "����(Exception)"�� �߻��Ѵ�
	}
}

/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayIndexTest.main(ArrayIndexTest.java:12)*/

		/*
		int []data= {1,2,3,4,5};
		for(int i:data)//==> for-each �ݺ������� i�� �迭�� ���� �ϳ��� �����´�
		{
			System.out.println(i)// �̰Ŵ� ����ϸ� ���� �ϳ��� ������ ���������� 1,2,3,4,5�� ��µȴ�
			System.out.println(data[i])//i��ü�� �迭�� ���� ���� ���µ� �װ� �ε����� �����ִ� �̰Ŵ� ����ϸ� data[0]�� �ƴ� data[1]
			                            //���� ����ϴ� 2,3,4,5
		}*/