class Bird
{
	protected String name;
	protected String color;
	protected boolean wing;

	public Bird(String color,String name,boolean wing)
	{
		this.name=name;
		this.color=color;
		this.wing= wing;
	}
	public Bird()
	{
		
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setWing(boolean wing)
	{
		this.wing=wing;
	}
	public boolean getWing()
	{
		return wing;
	}

	public void fly()
	{
		if(wing==true)
		{
			System.out.printf("%s색 %s가(이) 훨~훨~\n",color,name);
		}
		else
		{
			System.out.printf("%s색 %s가(이) 날 수 없어요\n",color,name);
		}
	}
}

class Airplane extends Bird
{
    private boolean engine;
	public Airplane(String name,String color, boolean wing,boolean engine)
	{
		this.name=name;
		this.color=color;
		this.wing= wing;
		this.engine= engine;
	}

	public Airplane()
	{
		
	}

    public void setEngine(boolean engine)
	{
		this.engine=engine;
	}

	public boolean getEngine()
	{
		return engine;
	}

	public void fly()
	{
		if(engine==true && wing==true)
		{
			System.out.printf("%s색 %s가(이) 슝~슝~\n",color,name);
		}
		else
		{
			System.out.printf("%s색 %s가(이) 날 수 없어요\n",color,name);
		}
	}
	
}

class BirdTest02 
{
	public static void main(String[] args) 
	{
		Bird b1= new Bird("노란","참새",true);
		Bird b2= new Bird("검은","비둘기",false);
		b1.fly();
		b2.fly();

		Airplane a1= new Airplane("보잉747","하늘",true,true);
		a1.fly();
	}
}
