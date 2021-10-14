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
		return cal+"cal\n"+price+"원\n"+gram+"g\n"+farm+"농장";
  }

}

class FoodTest 
{
	public static void main(String[] args) 
	{
		Melon mel= new Melon(200,3000,100,"강원도");
		System.out.println(mel);
	}
}
