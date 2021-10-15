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
		return "�̸�: "+name+", ���: "+number+" ����: "+pay;
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
		return "�̸�: "+name+", ���: "+number+" �ñ�: "+hourpay+" ���� �ð�: "+hour;
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
        
		System.out.print("����� �̸��� �Է��ϼ���==>");
		name= sc.next();
        System.out.print("����� ����� �Է��ϼ���==>");
		number= sc.next();
        do{System.out.print("���� ������ȣ�� �Է��ϼ��� 1: ������ 2: �ð�������");
		type= sc.nextInt();}while(type!=1 && type!=2);

		switch(type)
		{
			case 1:
				double pay; 
			    System.out.print("����� ȣ���� �Է��ϼ���==>");
				pay= sc.nextDouble();
				e1= new SalariedEmployee(name,number,pay);
				break;
				default:
					double hourpay;
				    double hour;
				System.out.print("����� ���� �ð��� �Է��ϼ���==>");
				hour= sc.nextDouble();
				System.out.print("����� �ð� �� �ӱ��� �Է��ϼ���==>");
				hourpay= sc.nextDouble();
				e1= new HourlyEmployee(name,number,hour,hourpay);
		}

		e1.computeSalary();
		System.out.println(e1);
	}
}
