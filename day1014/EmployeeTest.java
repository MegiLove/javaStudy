class Employee
{
	protected String name;
	protected String number;

	public Employee()
	{
		
	}
	public Employee(String name,String number)
	{
		this.name=name;
		this.number=number;
	}

	public double computeSalary()
	{
	   return 0;
	}
}

class SalariedEmployee extends Employee
{
	double pay;
	public SalariedEmployee()
	{
		
	}
	public SalariedEmployee(String name,String number,double pay)
	{
		this.name=name;
		this.number=number;
		this.pay=pay;
	}
	public double computeSalary()
	{
	   return pay;
	}

	public String toString()
	{
		return "이름: "+name+", 사번: "+number+" 월급: "+pay;
	}

	
}

class HourlyEmployee extends Employee
{
	double hourpay;
	double hour;

    public HourlyEmployee()
	{
		
	}
	public HourlyEmployee(String name,String number,double hourpay,double hour)
	{
		this.name=name;
		this.number=number;
		this.hourpay=hourpay;
		this.hour=hour;
	}
    public double computeSalary()
	{
		  double pay= hourpay*hour;
		  return pay;
	}
	public String toString()
	{
		return "이름: "+name+", 사번: "+number+" 시급: "+hourpay+" 일한 시간: "+hour;
	}

}

class EmployeeTest
{
	public static void main(String[] args) 
	{
		SalariedEmployee e1= new SalariedEmployee("김유신","01",300);
        HourlyEmployee e2= new HourlyEmployee("홍길동","02",50,7);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.computeSalary());
		System.out.println(e2.computeSalary());
		
	}
}
