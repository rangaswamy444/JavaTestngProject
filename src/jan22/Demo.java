package jan22;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
		int x=45,y=0,z;
		z=x/y;
		System.out.println(z);
		}
		catch(Throwable t)
		{
			
			System.out.println(t.getMessage());
			//t.printStackTrace();
		}
		int a=4567, b=7,c;
		c=a/b;
		System.out.println(c);
	}

}
