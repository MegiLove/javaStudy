import java.util.Scanner;
class ScoreTest 
{
	public static void main(String[] args) 
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("10명의 점수를 입력해주세요");
		int []arr= new int[10];
		int i;
		int max=arr[0];
		int min=987654321
		for(i=0; i<arr.length; i++){
		arr[i]= sc.nextInt();
		}
		for(i=1; i<arr.length; i++){
			if(arr[i]>max){
				max= arr[i];
			}
			if(arr[i]<min){
				min= arr[i];
		}
		}
		System.out.println("max: "+max);
        System.out.println("min: "+min);
       

	}
}
