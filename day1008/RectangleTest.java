class Rectangle02
{
	double a;
	double b;
	
	double areacheck(double a, double b){
		double area;
		area= a*b;
		return area;
	}
}

class RectangleTest 
{
	public static void main(String[] args) 
	{
		Rectangle02 r= new Rectangle02();
		double area=r.areacheck(5,7);
		System.out.printf("�簢���� ���̴� %f�Դϴ�",area);
	}
}
