import java.util.Scanner;
class Customer
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

        String name;
		int price,number;

		System.out.println("��ǰ���� �Է����ּ���");
		name= sc.next();
		System.out.println("�ܰ��� �Է����ּ���");
		price= sc.nextInt();
		System.out.println("���ż����� �Է����ּ���");
		number= sc.nextInt();
		double cusprice;
		cusprice= price*number;
        if(number>=10 || cusprice>=20000)
			cusprice= 0.9*cusprice;
        System.out.println(name+"�� ���� �����ؾ��ϴ� �ݾ���"+cusprice+"�� �Դϴ�");



	}
}