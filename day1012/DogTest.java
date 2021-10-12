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
		result+= "�̸�: "+name+"\n";
		result+= "����: "+age+"\n";
		result+= "����: "+breed;
		return result;
	}

}

class DogTest 
{
	public static void main(String[] args) 
	{
		Dog d1= new Dog("�۸���",6);
        Dog d2= new Dog("�տ���","��Ƽ��",12);
		System.out.println(d1);
		System.out.println(d2);
	}
}
