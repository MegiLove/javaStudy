import java.util.Scanner;
class Scholarship 
{
	public static void main(String[] args) 
	{Scanner sc= new Scanner(System.in);
		String name;
		int kor,eng,math,avg;
		
		System.out.println("�̸��� �Է����ּ���");
		name= sc.next();
		System.out.println("���������� �Է����ּ���");
		kor= sc.nextInt();
		System.out.println("���������� �Է����ּ���");
		eng= sc.nextInt();
        System.out.println("���������� �Է����ּ���");
		math= sc.nextInt();
        avg= (kor+eng+math)/3;
		if(avg>=90&& kor>=90)
			System.out.println("���б��� �����մϴ�");
		else
            System.out.println("���б� ���� ����ڰ� �ƴմϴ�");

	}
}
