class Company
{
	private String number;
	private String name;
	private String locate;

    public Company(String number, String name, String locate)
	{
		this.number= number;
		this.name= name;
        this.locate= locate;
	}
    
	public void setNumber(String number)
	{
		this.number=number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLocate(String locate)
	{
		this.locate=locate;
	}

	public String getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getLocate()
	{
		return locate;
	}

	public String toString()
	{
		String result="";
		result+= "부서번호: "+number+"\n";
		result+= "부서명: "+name+"\n";
		result+= "부서위치: "+locate;
		return result;
	}
}

class CompanyTest02
{
	public static void main(String[] args) 
	{
		Company com1= new Company("10","총무팀","서울");
		Company com2= new Company("20","개발팀","제주");
		System.out.println(com1);
		System.out.println(com2);
	}
}
