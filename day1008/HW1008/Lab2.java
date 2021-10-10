class Box
{
	int width;
	int length;
	int height;

	public int getWidth()
	{
		return width;
	}
	public int getLength()
	{
		return length;
	}
	public int getHeight()
	{
		return height;
	}
	public void setWidth(int a)
	{
		width=a;
	}
	public void setLength(int a)
	{
		length=a;
	}
	public void setHeight(int a)
	{
		height=a;
	}

	public void getVolume()
    {
		int volume= width*length*height;
		System.out.println("부피: "+volume);
    }

	public String toString()
	{
		return "가로는"+width+" 세로는"+length+" 높이는"+height;
	}
	
}

class Lab2 
{
	public static void main(String[] args) 
	{
		Box box1= new Box();
		Box box2= new Box();

		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		box1.getVolume();
		System.out.println(box1);
		box1=box2;
        System.out.println(box1);
	}
}
