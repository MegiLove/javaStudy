import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		int []count= new int[26];
        
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		String buffer= sc.nextLine();

		System.out.println(buffer);

		//�� ���ڰ� �����ϴ� Ƚ���� ����Ѵ�(��, ��ĭ�� �����Ѵ�)
		for(int i=0; i<buffer.length(); i++){
			char ch= buffer.charAt(i);
			if(ch!=' '){
				if (ch>='A' && ch<= 'Z'){
					ch=(char)(ch+32);
				}
				count[ch-'a']++;
			}
		}
        for(int i=0; i<count.length; i++){
			System.out.printf("%c�� ������%5d\n",(char)(i+97),count[i]);
        }
		
	}
}

//next�� ������ �Է¹��� �� ���� hello korea�ϸ� ���� ���� hello������ ���
//nextLine�� ������ �Է¹��� �� �ִ�