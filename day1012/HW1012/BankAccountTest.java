class BankAccount
{
	private String name;
	private String number;
	private double balance;
	private double interest;
	
	public BankAccount()
	{
		
	}

	public BankAccount(String name)
	{
		this.name= name;
		
	}

	public BankAccount(String name,String number)
	{
		this.name= name;
		this.number= number;
	}

    public BankAccount(String name,double balance)
	{
		this.name= name;
		this.balance= balance;
	}

	 public BankAccount(String name,String number,double balance,double interest)
	{
		this.name= name;
		this.number= number;
		this.balance= balance;
		this.interest= interest;
	}

	public String toString()
	{
		String result="";
		result+= "ÀÌ¸§: "+name+"\n";
		result+= "°èÁÂ ¹øÈ£: "+number+"\n";
		result+= "ÀÜ¾×: "+balance+"¿ø\n";
		result+= "ÀÌÀÚÀ²: "+interest+"%\n";
		return result;
	}
}

class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount b1= new BankAccount("±èÀ¯½Å",30000);
		System.out.println(b1);
		BankAccount b2= new BankAccount("±èÀ¯½Å","1102345678",30000,2.3);
		System.out.println(b2);
	}
}
