class NotDefine 
{
	public static void main(String[] args) 
	{
		String name
		name="유하림";
		System.out.println("이름은"+name);
	}
}
/*

C:\javaStudy\day0928>javac NotDefine.java
NotDefine.java:6: error: cannot find symbol
                name="유하림";
                ^
  symbol:   variable name
  location: class NotDefine
NotDefine.java:7: error: cannot find symbol
                System.out.println("이름은"+name);
                                         ^
  symbol:   variable name
  location: class NotDefine
2 errors

*/