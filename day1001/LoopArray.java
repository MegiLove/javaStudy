class LoopArray 
{
	public static void main(String[] args) 
	{
		//1부터 45까지의 숫자 6개를 말해 봅니다.
		int []lotto= {4,11,19,26,27,43};
		/*System.out.println("로또 번호");
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);*/

		for(int i=0;i<lotto.length; i++){
			System.out.print(lotto[i]+" ");
		}
		
	}
}
