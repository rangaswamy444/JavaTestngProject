package pack1;

public class AccessModifiers 
{
	public static String str1="india";
	private static int a=45;
	protected static double d=3456.54;
	static char c='c';
	
	public static void publicMethod()
	{
		System.out.println(str1);
	}
	private static void privateMethod()
	{
		System.out.println(a);
	}
	protected static void protectedMethod()
	{
		System.out.println(d);
	}
	static void defaultMethod()
	{
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  AccessModifiers.privateMethod();
		  AccessModifiers.publicMethod();
		  AccessModifiers.protectedMethod();
		  AccessModifiers.defaultMethod();
		  
	}

}
