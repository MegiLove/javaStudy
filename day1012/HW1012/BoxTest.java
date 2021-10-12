class Box
{
	private int width;
	private int length;
	private int height;
	private boolean empty;

    public String toString()
	{
		String result="";
        result+="채워져있는가? "+empty+"\n";
		result+="가로: "+width+"\n";
		result+="세로: "+length+"\n";
		result+="높이: "+height+"\n";
		return result;
	}
    public void setEmpty(boolean empty)
	{
		this.empty= empty;
	}


	public Box()
	{
		this.empty=false;
	}
	public Box(int width)
	{
		this.width= width;
		this.empty= false;
	}
	public Box(int width, int length)
	{
		this.width= width;
		this.length= length;
		this.empty= false;
	}
	public Box(int width, int length,int height)
	{
		this.width= width;
		this.length= length;
		this.height= height;
		this.empty= false;
	}
}

class BoxTest 
{
	public static void main(String[] args) 
	{
		Box b1= new Box();
		System.out.println(b1);
		Box b3= new Box(6);
		b3.setEmpty(true);
		System.out.println(b3);
		Box b4= new Box(6,5);
		System.out.println(b4);
		Box b5= new Box(6,5,3);
		b5.setEmpty(true);
		System.out.println(b5);
		
	}
}
