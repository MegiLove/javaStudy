class Product
{
	private String name;
	private int amount;
	private int price;

	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAmount(int amount)
	{
		this.amount=amount;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
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
		result+="상품명:"+name+"\n";
		result+="수량:"+amount+"\n";
		result+="단가:"+price;
		return result;
	}
}

class ProductTest02
{
	public static void main(String[] args) 
	{
		Product p1= new Product();
		p1.setName("선풍기");
        p1.setAmount(21);
		p1.setPrice(30000);
		/*System.out.println("상품이름: "+p1.getName());
		System.out.println("수량: "+p1.getAmount()+"개");
		System.out.println("단가: "+p1.getPrice()+"원");
		*/
		System.out.println(p1);
		int total= p1.getAmount()*p1.getPrice();
        System.out.println("총금액: "+total+"원");
	}
}
