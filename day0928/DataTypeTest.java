class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age=27;
		System.out.println("�ӻ����� ����:"+age+"���Դϴ�");

		//double height;
		float height;
		//height=173.8
		//height=173.8f;//�Ǽ����� float������ �����ϱ� ���ؼ��� ���̻� f
        height=(float)173.8;//�ڷ�����ȯ�� �Ͽ� ������ �� �ִ�
		System.out.println("�ӻ����� Ű:"+height);

	    char gender;
	    gender= 'M';
		//gender="M"; //�ֵ���ǥ�� ������ ���ڿ�(String)���� ����ϱ� ������ char�� ������ �� ����
		System.out.println("�ӻ����� ������:"+gender);

		boolean isVaccine;
		isVaccine= true;
		System.out.println("�ӻ����� 1����� ��������:"+ isVaccine);
	}
}
/*

DataTypeTest.java:14: error: incompatible types: possible lossy conversion from double to float
                height=173.8;
                       ^
1 error
*/

/*
DataTypeTest.java:21: error: incompatible types: String cannot be converted to char
                gender="M";
                       ^
1 error
*/