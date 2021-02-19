package jan22;

public class Demo1 {

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		try
		{
		int x [] =new int [3];
		x[0]=100;
		x[1]=456;
		x[2]=678;
		x[3]=654;
		x[4]=345;
		
	
	for(int each: x)
	{
		System.out.println(each);
	}
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}
}
