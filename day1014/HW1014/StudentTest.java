class Student
{
	private int number;
	public String name;
    
	public Student(int number,String name)
	{
		this.number=number;
		this.name=name;
	}
	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
	public void setName(int name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

public class GraduateStudent extends Student
{
	public String lab;
	public GraduateStudent(int number,String name,String lab)
	{
		super(100,name);
		this.lab=lab;
	}
}

class StudentTest
{
	public static void main(String[] args) 
	{
		GraduateStudent s= new GraduateStudent();
	}
}
