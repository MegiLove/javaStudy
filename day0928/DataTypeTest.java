class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age=27;
		System.out.println("임상진의 나이:"+age+"살입니다");

		//double height;
		float height;
		//height=173.8
		//height=173.8f;//실수값을 float변수에 저장하기 위해서는 접미사 f
        height=(float)173.8;//자료형변환을 하여 저장할 수 있다
		System.out.println("임상진의 키:"+height);

	    char gender;
	    gender= 'M';
		//gender="M"; //쌍따옴표로 묶으면 문자열(String)으로 취급하기 때문에 char에 저장할 수 없다
		System.out.println("임상진의 성별은:"+gender);

		boolean isVaccine;
		isVaccine= true;
		System.out.println("임상진의 1차백신 접종여부:"+ isVaccine);
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