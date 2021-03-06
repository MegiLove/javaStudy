class Person 
{
	private String name;
	private int age;
    
	public void setName(String n)
	{
		name=n;
	}
    public void setAge(int n)
	{
		age=n;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
    {
        return age;
    }
}

class PersonTest02
{

	public static void main(String[] args) 
	{
		Person p1;
		p1= new Person();

		p1.setName("홍길동");
		p1.setAge(20);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}
}

/*
PersonTest02.java:15: error: name has private access in Person
                p1.name= "홍길동";
                  ^
PersonTest02.java:16: error: age has private access in Person
                p1.age=20;
                  ^
PersonTest02.java:18: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:19: error: age has private access in Person
        System.out.println(p1.age);

Person 클래스의 private영역의 속성(멤버변수)에 직접 접근할 수 없다
접근할 수 있는 메소드를 public에 만들어두고 사용해야한다
접근해서 값을 변경하는 메소드는 setXXX로 만들고
접근해서 값을 읽어오는 메소드는 getXXX로 만든다
이것을 setter, getter라고 부른다

따라서 클래스를 만들 때에
보통은 모든 멤버변수들은 private영역에 두고
그 private영역에 멤버변수에 접근하기 위한 setter getter를
public에 모두 만들어야 한다

setter는 멤버변수의 값을 변경하기 위한 메소드이니
어떤값으로 바꿀지 매개변수가 필요하고
getter는 매개변수가 필요없다

getter는 멤버변수의 값을 반환하는 메소드이니
반환값이 있고 setter는 반환값이 없다
*/
