class MyUtil
{ static void gugudan(int dan){//static을 붙이면 객체 생성 안해도 된다 MyUtil mu= new MyUtil(); 이거 안해도 된다는 거
	System.out.printf("***%d단***\n",dan);
	for(int i=1;i<=9 ; i++)
	{
		System.out.printf("%d*%d=%d\n",dan,i,dan*i);
	}
  return;
}
}

class MethodTest02
{
	public static void main(String[] args) 
	{
		MyUtil.gugudan(9);//객체생성을 안했으므로 점 앞에 클래스 이름을 붙여쓴다
		System.out.println("============================");
		MyUtil.gugudan(10);
	}
}
