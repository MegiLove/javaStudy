class BankAccount
{
	double balance;
	public void deposit(double amount)
	{   
		balance= balance+amount;
	}

	public void withdraw(double amount)
	{ 
		if(balance<0)
		{
			System.out.println("예금 인출을 하실 수 없습니다");
		}
		else
		{
			balance= balance-amount;
		}
		
	}

	public double getBalance()
    {
		return balance;
    }

	public void printBalance()
	{
		System.out.println(balance);
	}

	public void addInterest()
    {
		balance= balance+balance*0.075;
		System.out.println(balance);
    }

}

class Lab3 
{
	public static void main(String[] args) 
	{
		BankAccount a1= new BankAccount();
		BankAccount a2= new BankAccount();
		a1.deposit(100);
		a1.withdraw(60);
		a2.deposit(-3);
		a2.withdraw(30);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
		a1.printBalance();
		a1.addInterest();
		
	}
}
