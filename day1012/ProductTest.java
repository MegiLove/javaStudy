class Product
{
	private String name;
	private int amount;
	private int price;

	public void setName(String a)
	{
		name=a;
	}
	
	public void setAmount(int a)
	{
		amount=a;
	}
	
	public void setPrice(int a)
	{
		price=a;
	}

	public String getName()
	{
		return name;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public int getPrice()
	{
		return price;
	}

	public String toString()
	{
		String result="";
		result+="��ǰ��:"+name+"\n";
		result+="����:"+amount+"\n";
		result+="�ܰ�:"+price;
		return result;
	}
}

class ProductTest
{
	public static void main(String[] args) 
	{
		Product p1= new Product();
		p1.setName("��ǳ��");
        p1.setAmount(21);
		p1.setPrice(30000);
		/*System.out.println("��ǰ�̸�: "+p1.getName());
		System.out.println("����: "+p1.getAmount()+"��");
		System.out.println("�ܰ�: "+p1.getPrice()+"��");
		*/
		System.out.println(p1);
		int total= p1.getAmount()*p1.getPrice();
        System.out.println("�ѱݾ�: "+total+"��");
	}
}
