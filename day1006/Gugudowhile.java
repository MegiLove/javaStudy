class Gugudowhile 
{
	public static void main(String[] args) 
	{   
		int i=2; 
		int j;
		do{
            System.out.println(i+"�� ����!");
            j=1;
            do{
			System.out.printf("%d*%d=%d\n",i,j,i*j);
			j++;	
            }while(j<=9);

			i++;
		}while(i<=9);
	}
}
