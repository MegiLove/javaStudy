import java.util.Scanner;
class Customer
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

        String name;
		int price,number;

		System.out.println("상품명을 입력해주세요");
		name= sc.next();
		System.out.println("단가를 입력해주세요");
		price= sc.nextInt();
		System.out.println("구매수량을 입력해주세요");
		number= sc.nextInt();
		double cusprice;
		cusprice= price*number;
        if(number>=10 || cusprice>=20000)
			cusprice= 0.9*cusprice;
        System.out.println(name+"에 대해 지급해야하는 금액은"+cusprice+"원 입니다");



	}
}
