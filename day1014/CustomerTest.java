class Person
{
   String name;
   String addr;
   String number;
}

class Customer extends Person
{
	String cusnumber;
	int mile;
}

class  CustomerTest
{
	public static void main(String[] args) 
	{
		Customer cus= new Customer();
		cus.name="유하림";
		cus.addr="서울시 서대문구";
		cus.number="021234567";
		cus.cusnumber="01053058760";
		cus.mile=10000;

		System.out.println(cus.name);
		System.out.println(cus.addr);
		System.out.println(cus.number);
		System.out.println(cus.cusnumber);
		System.out.println(cus.mile);
	}
}
