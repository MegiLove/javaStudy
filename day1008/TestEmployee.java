import java.util.Scanner;
class Employee
{
	String name;
	String addr;
	int salary;
	String phone;
}

/*
건우가 손에 아이폰을 들고 이스트백을 메고 은행에 들어갑니다

클래스를 설계할 때에는 내가 표현하고자 하는 객체에 대해서
어떤 속성과 동작을 가져야 하는지 분석을 해야 한다
속성- 멤버변수
동작- 멤버메소드(멤버함수)
*/
class TestEmployee
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Employee []e= new Employee[5];
		for(int i=0; i<e.length; i++){
		e[i]= new Employee();
		System.out.println("이름을 입력해주세요");
		e[i].name= sc.next();
		System.out.println("주소을 입력해주세요");
		e[i].addr= sc.next();
		System.out.println("연봉을 입력해주세요");
		e[i].salary= sc.nextInt();
		System.out.println("전화번호을 입력해주세요");
		e[i].phone= sc.next();
	    }

		System.out.print("이름\t주소\t연봉\t전화번호\n");
        for(int i=0; i<e.length; i++)
		{			
		  System.out.printf("%s\t%s\t%d\t%s\n",e[i].name,e[i].addr,e[i].salary,e[i].phone);
        }
	}
}
