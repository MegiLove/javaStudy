class Food
{
   protected int cal;
   protected int price;
   protected int gram;
}

class Melon extends Food
{
	String farm;
    

  public Melon(int cal, int price, int gram, String farm)
  {
		this.cal= cal;
		this.price= price;
		this.gram= gram;
		this.farm= farm;
  }

  public String toString()
  {
		return cal+"cal\n"+price+"��\n"+gram+"g\n"+farm+"����";
  }

}

class FoodTest 
{
	public static void main(String[] args) 
	{
		Melon mel= new Melon(200,3000,100,"������");
		System.out.println(mel);
	}
}
