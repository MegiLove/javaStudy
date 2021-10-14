class Person
{
   protected String name;
   protected String addr;
   protected String number;

   public void setName(String name)
	{
		this.name=name;
	}
   public String getName()
	{
		return name;
	}
   public void setAddr(String addr)
	{
		this.addr=addr;
	}
   public String getAddr()
	{
		return addr;
	}
   public void setNumber(String number)
	{
		this.number= number;
	}
   public String getNumber()
	{
		return number;
	}
}

class Customer extends Person
{
	private String cusnumber;
	private int mile;
   public void setCusnumber(String cusnumber)
	{
		this.cusnumber= cusnumber;
	}
   public String getCusnumber()
	{
		return cusnumber;
	}
	 public void setMile(int mile)
	{
		this.mile= mile;
	}
   public int getMile()
	{
		return mile;
    }
	public void printCustomer()
	{
		System.out.println(name);
		System.out.println(addr);
		System.out.println(number);
		System.out.println(cusnumber);
		System.out.println(mile);
	}
	

	
}

class  CustomerTest03
{
	public static void main(String[] args) 
	{
		Customer cus= new Customer();
		cus.setName("유하림");
		cus.setAddr("서울시 서대문구");
		cus.setNumber("021234567");
		cus.setCusnumber("01053058760");
		cus.setMile(10000);
       
	   cus.printCustomer();
	}
}
