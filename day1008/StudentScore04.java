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



class StudentScore04
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
	  n=100;
	  //기본자료형 변수는 선언하고 값을 바로 저장할 수 있다!

	  Student s;
	  //그러나 참조자료형인 객체참조변수는 선언하고 바로 값을 저장할 수 없다, 객체를 생성하지 않고는 멤버변수를 사용할 수 없다!
	  s.name= "홍길동";

	  //사용하려면 반드시 객체참조변수를 통해서 new 연산자를 이용하여 객체를 생성하고 사용할 수 있다
	  s= new Student();//객체를 생성하는 문장이다
	  //라고 하고 s를 통해서 멤버변수를 사용할 수 있다
	  s.name= "홍길동";

	  //다음의 객체를 참조하는 배열의 경우를 보자
	  Student []arr= new Student[5];//학생 5명을 배열로 만든것
	  //위의 문장은 Student의 객체를 생성한 것이 아니라
	  //Student의 객체를 참조할 수 있는 배열을 5개 만든 것이다

	  //따라서 arr[0].name은 쓸 수 없다
	}

}

