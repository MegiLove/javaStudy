/* Ŭ���� ���ظ� ���� ���� ����
Ŭ������ �����θ� �� ���� ������ ���ε��� �ִ� ���� �ƴ϶� �ϳ��� ��Ʈ�� ǥ���� �� ������ 
*/

import java.util.Scanner;
class Student
{
  String name;
  int kor;
  int eng;
  int math;
  int tot;
  double avg;
}



class StudentScore03
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  Student s= new Student();//s�� ��ü��������, new�ϸ��� �� �޸𸮿� student ��ü�� ���������
	  s.name= "ȫ�浿";         //s.name= "ȫ�浿", .�� ������ٿ����ڶ�� �Ѵ�
      s.kor= 100;
	  s.eng=80;
	  s.math= 90;

      s.tot= s.kor+s.eng+s.math;
	  s.avg= s.tot/3.0;
	  
	  System.out.println("�̸�: "+s.name);
	  System.out.println("����: "+s.kor);
	  System.out.println("����: "+s.eng);
	  System.out.println("����: "+s.math);
	  System.out.println("����: "+s.tot);
	  System.out.println("���: "+s.avg);
	}

}
