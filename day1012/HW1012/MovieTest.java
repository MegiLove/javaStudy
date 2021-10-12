class Movie
{
	private String title;
	private String director;
	private String maker;

    public Movie()
	{
		
	}

	public Movie(String title)
	{
		this.title= title;
	}

	public Movie(String title,String director)
	{
		this.title= title;
		this.director= director;
	}

	public Movie(String title,String director,String maker)
	{
		this.title= title;
		this.director= director;
		this.maker= maker;
	}

	public String toString()
	{
		String result="";
		result+= "����: "+title+"\n";
		result+= "����: "+director+"\n";
		result+= "���ۻ�: "+maker+"\n";
		return result;
	}

}

class MovieTest 
{
	public static void main(String[] args) 
	{
		Movie m1= new Movie("�����","����ȣ","CJ");
		Movie m2= new Movie("����","����ȣ");
		System.out.println(m1);
        System.out.println(m2);
	}
}
