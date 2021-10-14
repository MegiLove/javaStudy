class Food
{
	protected int cal;
	protected int price;
	protected int gram;

	public Food()
	{
		
	}

	public Food(int cal, int price,int gram)
	{
		this.cal= cal;
		this.price=price;
		this.gram=gram;
	}

	public String toString()
	{
	    return "칼로리: "+cal+",가격: "+price+",중량: "+gram;
	}
	
}

class Melon extends Food
{
	String farm;

	public Melon()
	{
		
	}

	public Melon(int cal, int price,int gram,String farm)
	{   
		this.cal= cal;
		this.price=price;
		this.gram=gram;
		this.farm=farm;
	}

	public void printMelon()
	{
		System.out.printf("칼로리: %d\n",cal);
		System.out.printf("가격: %d\n",price);
		System.out.printf("중량: %d\n",gram);
		System.out.printf("경작 농원: %s\n",farm);
	}

	
	
	public String toString()
	{   //return "칼로리: "+cal+",가격: "+price+",중량: "+gram+",경작농원: "+farm;
		return super.toString()+",경작농원: "+farm;
		//부모클래스의 동일한 메소드를 요청하기 위해서는 super.메소드 명으로 사용합니다
	}
	
    
}
class Milk extends Food
{
	private String brand;
	public Milk(int cal,int price,int gram,String brand)
	{
		super(cal,price,gram);
		this.brand=brand;
	}

	public String toString()
	{
		return super.toString()+", 브랜드: "+brand;
	}

}


class FoodTest02 
{
	public static void main(String[] args) 
	{
		Melon m= new Melon(200,3000,100,"강릉농장");
        m.printMelon();

		Milk milk= new Milk(200,900,100,"서울우유");
		System.out.println(milk);
	}
}
