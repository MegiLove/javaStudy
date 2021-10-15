import java.util.Scanner;
abstract class Employee
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

	public abstract double computeSalary();
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

class EmployeeTest03
{
	public static void main(String[] args) 
	{
		Employee e1;
		Scanner sc= new Scanner(System.in);
		int type;
		String name;
		String number;
        
		System.out.print("사원의 이름을 입력하세요==>");
		name= sc.next();
        System.out.print("사원의 사번을 입력하세요==>");
		number= sc.next();
        do{System.out.print("직원 유형번호를 입력하세요 1: 정직원 2: 시간제직원");
		type= sc.nextInt();}while(type!=1 && type!=2);

		switch(type)
		{
			case 1:
				double pay; 
			    System.out.print("사원의 호봉을 입력하세요==>");
				pay= sc.nextDouble();
				e1= new SalariedEmployee(name,number,pay);
				break;
				default:
					double hourpay;
				    double hour;
				System.out.print("사원의 일한 시간을 입력하세요==>");
				hour= sc.nextDouble();
				System.out.print("사원의 시간 당 임금을 입력하세요==>");
				hourpay= sc.nextDouble();
				e1= new HourlyEmployee(name,number,hour,hourpay);
		}

		e1.computeSalary();
		System.out.println(e1);
	}
}
