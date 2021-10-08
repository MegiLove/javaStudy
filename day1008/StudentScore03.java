/* 클래스 이해를 돕기 위한 예시
클래스를 만들어두면 한 명의 정보가 따로따로 있는 것이 아니라 하나의 세트로 표현될 수 있으니 
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
	  Student s= new Student();//s는 객체참조변수, new하면은 힙 메모리에 student 객체가 만들어진다
	  s.name= "홍길동";         //s.name= "홍길동", .은 멤버접근연산자라고 한다
      s.kor= 100;
	  s.eng=80;
	  s.math= 90;

      s.tot= s.kor+s.eng+s.math;
	  s.avg= s.tot/3.0;
	  
	  System.out.println("이름: "+s.name);
	  System.out.println("국어: "+s.kor);
	  System.out.println("영어: "+s.eng);
	  System.out.println("수학: "+s.math);
	  System.out.println("총점: "+s.tot);
	  System.out.println("평균: "+s.avg);
	}

}

