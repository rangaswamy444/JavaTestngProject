package jan21;
public class Demo {
public static void add(int a, int b)
{
	int c=a+b;
	System.out.println(c);
}
public static String verifyString(String str1,String str2)
{
	String res="";
	if(str1.equals(str2))
	{
		res="Strings are equal";
	}
	else
	{
		res="Strings are not equal";
	}
	return res;
}
public static boolean compare(int x, int y)
{
	if(x==y)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Demo.add(200, 87);
		String results=Demo.verifyString("Hello", "hello");
System.out.println(results);
boolean res=Demo.compare(879, 654);
System.out.println(res);
	}

}



