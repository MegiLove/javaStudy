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
		result+= "�μ���ȣ: "+number+"\n";
		result+= "�μ���: "+name+"\n";
		result+= "�μ���ġ: "+locate;
		return result;
	}
}

class CompanyTest02
{
	public static void main(String[] args) 
	{
		Company com1= new Company("10","�ѹ���","����");
		Company com2= new Company("20","������","����");
		System.out.println(com1);
		System.out.println(com2);
	}
}
