class Box
{
	private int width;
	private int length;
	private int height;
	private boolean empty;
	private String things;

    public String toString()
	{   String r= "비어있음";
		if(!empty)
		{
			r= "비어있지 않음";	
		}
		String result="";
        result+=r+"\n";
		result+="가로: "+width+"\n";
		result+="세로: "+length+"\n";
		result+="높이: "+height+"\n";
		result+="들어있는 것: "+things+"\n";
		return result;
	}
    
    public void put(String things)
	{
		this.things= things;
		empty= false;
		System.out.println(things+"을 넣었습니다");
	}

	public void take()
	{
		System.out.println(things+"을 빼냈습니다");
		things= null;
		empty= true;
	}

	public Box()
	{
		this.empty=true;
	}
	public Box(int width)
	{
		this.width= width;
		this.empty= true;
	}
	public Box(int width, int length)
	{
		this.width= width;
		this.length= length;
		this.empty= true;
	}
	public Box(int width, int length,int height)
	{
		this.width= width;
		this.length= length;
		this.height= height;
		this.empty= true;
	}
}

class BoxTest 
{
	public static void main(String[] args) 
	{
		Box b1= new Box();
		System.out.println(b1);
		Box b5= new Box(6,5,3);
		b5.put("책");
		System.out.println(b5);
		b5.take();
		System.out.println(b5);
	}
}
