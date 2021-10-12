class Dog
{
	private String name;
	public String breed;
	private int age;

	public Dog(String name,int age)
	{
			this.name= name;
			this.age= age;
	}

    public Dog(String name,String breed, int age)
	{
			this.name= name;
			this.age= age;
			this.breed= breed;
	}

	public String toString()
	{
		String result="";
		result+= "¿Ã∏ß: "+name+"\n";
		result+= "≥™¿Ã: "+age+"\n";
		result+= "¡æ∑˘: "+breed;
		return result;
	}

}

class DogTest 
{
	public static void main(String[] args) 
	{
		Dog d1= new Dog("∏€∏€¿Ã",6);
        Dog d2= new Dog("ø’ø’¿Ã","∏ª∆º¡Ó",12);
		System.out.println(d1);
		System.out.println(d2);
	}
}
