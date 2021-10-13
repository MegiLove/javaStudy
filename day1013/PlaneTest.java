class Plane
{
	private String name;
	private String model;
	private int customer;
    private static int planes;
    
	public Plane()
	{
		planes++;
	}
    
    public static int getPlanes()
	{
		return planes;
	}

    public Plane(String name, String model, int customer)
	{
		this.name= name;
        this.model=model;
		this.customer=customer;
		planes++;
	}

	public String toString()
	{
		return name+","+model+","+customer+"명";
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public String getModel()
	{
		return model;
	}
	public void setCustomer(int customer)
	{
		this.customer=customer;
	}
	public int getCustomer()
	{
		return customer;
	}

	
}


class PlaneTest
{ 
	public static void main(String[] args) 
	{
		Plane p1= new Plane("에어버스","A380",500);
		Plane p2= new Plane("에어버스2","B70",300);
		Plane p3= new Plane("에어버스3","C500",150);
        
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(Plane.getPlanes()+"대");

	}
}
