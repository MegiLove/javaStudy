import java.util.Scanner;
class StudentTest

{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		
		System.out.println("�̸��� �Է����ּ���");
		name= sc.next();
		System.out.println("���������� �Է����ּ���");
		kor= sc.nextInt();
		System.out.println("���������� �Է����ּ���");
		eng= sc.nextInt();
        System.out.println("���������� �Է����ּ���");
		math= sc.nextInt();
        tot= kor+eng+math;
	    avg= tot/3;
	    System.out.println("����: "+tot);
		System.out.println("���: "+avg);
		if(avg>=60)
			System.out.println("�հ��Դϴ�");
		else
            System.out.println("���հ��Դϴ�");


   


	}
}