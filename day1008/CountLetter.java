import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
		int []count= new int[26];
        
		System.out.print("문자열을 입력하시오: ");
		String buffer= sc.nextLine();

		System.out.println(buffer);

		//각 문자가 등장하는 횟수를 계산한다(단, 빈칸을 제외한다)
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
			System.out.printf("%c의 개수는%5d\n",(char)(i+97),count[i]);
        }
		
	}
}

//next는 공백을 입력받을 수 없다 hello korea하면 공백 전인 hello까지만 출력
//nextLine은 공백을 입력받을 수 있다