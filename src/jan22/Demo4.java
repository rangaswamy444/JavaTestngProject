package jan22;


public class Demo4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str1="Hello";
		String str2="India";
		if(str1.equals(str2))
	{
		System.out.println("Strings are Same");	
	}
		
	else
		try
		{
		throw new Error("Strings are not Same");
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
