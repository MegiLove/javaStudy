class Box
{
	private int width;
	private int length;
	private int height;
	private boolean empty;
	private String things;

    public String toString()
	{   String r= "�������";
		if(!empty)
		{
			r= "������� ����";	
		}
		String result="";
        result+=r+"\n";
		result+="����: "+width+"\n";
		result+="����: "+length+"\n";
		result+="����: "+height+"\n";
		result+="����ִ� ��: "+things+"\n";
		return result;
	}
    
    public void put(String things)
	{
		this.things= things;
		empty= false;
		System.out.println(things+"�� �־����ϴ�");
	}

	public void take()
	{
		System.out.println(things+"�� ���½��ϴ�");
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
		b5.put("å");
		System.out.println(b5);
		b5.take();
		System.out.println(b5);
	}
}
