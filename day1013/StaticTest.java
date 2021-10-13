class Family
{
	private String name;
	private int age;
	private String role;
	public static String addr;

	public Family(String name, int age, String role)
	{
		this.name= name;
		this.age= age;
		this.role= role;
	}
	
	public Family()
	{
			
	}

	public String toString()
    {
		return "[name:"+name+",age"+age+",role"+role+",addr"+addr+"]";
    }
}

class StaticTest 
{
	public static void main(String[] args) 
	{
		Family.addr="서울시 마포구 서교동 1234"; //객체를 생성하지 않고 사용한다 그래서 클래스 이름으로 접근
		//(객체).addr도 가능
		System.out.println("주소: "+Family.addr);

		Family.name="홍길동" //객체를 생성해서 객체에서 접근해야 함
	}
}
