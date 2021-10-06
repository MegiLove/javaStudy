import java.util.Scanner;
class InputString_Switch
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.println("문자열을 입력하세요");
	  String word;
	  int cnt=0;
	  word= sc.next();
	  for(int i=0; i<word.length(); i++){
      char c= word.charAt(i);
      switch(c){
		case 'a':case 'A':case 'e':case 'E':case 'i':case 'I':case 'o':case 'O':case 'u':case 'U':cnt++;
      }
      }
	  System.out.println("모음 개수: "+cnt);
	  }
    

	}

