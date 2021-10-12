class Company
{
	private String number;
	private String name;
	private String locate;

    public Company()
	{
		number= "021234567";
		name= "영업부";
        locate="서울시 강남구";
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

class CompanyTest
{
	public static void main(String[] args) 
	{
		Company com1= new Company();
		System.out.println(com1);
	}
}
