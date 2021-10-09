class Point
{
	int x;
	int y;
	public int getX()
    {
		return x;
    }
	public int getY()
    {
		return y;
    }
	public void setX(int xCoord)
	{
		x= xCoord;
	}
	public void setY(int yCoord)
	{
		y= yCoord;
	}

	public void Showposition()
	{
		System.out.println("("+x+","+y+")");
	}
}

class Lab1
{
	public static void main(String[] args) 
	{   int x;
	    int y;
		Point p1= new Point();
		Point p2= new Point();
		p1.setX(100);
		p1.setY(200);
		p2.setX(100);
		p2.setY(300);

		p1.Showposition();
		p2.Showposition();

	}
}
