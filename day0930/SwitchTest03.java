import java.util.Scanner;
class SwitchTest03
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int n;
		System.out.println("0~9������ ���� �Է����ּ���");
		n= sc.nextInt();
		if(n<1 || n>9){
			System.out.println("�Է¹����� �Ѿ����ϴ�");
		}else{

		String result="";
		switch(n){
			case 0: result="��";break;
			case 1: result="��";break;
            case 2: result="��";break;
			case 3: result="��";break;
			case 4: result="��";break;
			case 5: result="��";break;
			case 6: result="��";break;
			case 7: result="ĥ";break;
			case 8: result="��";break;
			case 9: result="��";break;
		}
        System.out.println(result);
		
		}
	}
}
