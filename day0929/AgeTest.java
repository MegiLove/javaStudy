import java.util.Scanner;
class AgeTest 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int ageA,ageB;
		System.out.println("A�� ���̸� �Է��ϼ���");
		ageA=sc.nextInt();
		System.out.println("B�� ���̸� �Է��ϼ���");
		ageB=sc.nextInt();

		if(ageA>=20 & ageB>=20)
         System.out.println("�� ����� ��� 20���Դϴ�");
		else
			System.out.println("�� ����� 20���� �ƴմϴ�");

	}
}
