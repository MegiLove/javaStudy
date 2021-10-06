import java.util.Scanner;
class InputString 
{
	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  System.out.println("문자열을 입력하세요");
	  String word;
	  int cnt=0;
	  word= sc.next();
	  for(int i=0; i<word.length(); i++){
		  if(word.charAt(i)=='a'|| word.charAt(i)=='e'|| word.charAt(i)=='i'|| word.charAt(i)=='o'|| word.charAt(i)=='u'||word.charAt(i)=='A'|| word.charAt(i)=='E'|| word.charAt(i)=='I'|| word.charAt(i)=='O'|| word.charAt(i)=='U'){
			cnt=cnt+1;
		  }
	  }
     System.out.println("모음 개수: "+cnt);

	}
}
