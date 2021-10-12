class Employee
{
	private String number;
	private String ename;
	private int pay;
	private String day;
	private String name;

	public Employee(String number,String ename,int pay,String day,String name)
	{
		this.number=number;
		this.ename=ename;
		this.pay=pay;
		this.day=day;
		this.name=name;
	}

	public Employee(String number,String ename,int pay)
	{
		this.number=number;
		this.ename=ename;
		this.pay=pay;
		day= "2022.03.30";
		name="스마트폰사업부";
	}

	public void setNumber(String number)
	{
		this.number=number;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setPay(int pay)
	{
		this.pay=pay;
	}
	public void setDay(String day)
	{
		this.day=day;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getNumber()
	{
		return number;
	}
	public String getEname()
	{
		return ename;
	}
	public int getPay()
	{
		return pay;
	}
	public String getDay()
	{
		return day;
	}
	public String getName()
	{
		return name;
	}

	public String toString()
	{
		String result="";
		result+="사원번호: "+number+"\n";
		result+="사원명: "+ename+"\n";
		result+="급여: "+pay+"\n";
		result+="입사일: "+day+"\n";
		result+="부서명: "+name;
		return result;
	}
}

class EmployeeTest02
{
	public static void main(String[] args) 
	{
		Employee em1= new Employee("12","김유신",300,"2022.03.30","스마트폰사업부");
		System.out.println(em1);
		Employee em2= new Employee("12","김유신",300);
		System.out.println(em2);
	}
}
