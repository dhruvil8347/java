public class trycatch 
{
	public static void main(String[] args) 
	{
		try 
		{
		int a = 100/0;
		System.out.println(a);
		}
		catch(Exception e) 
		{
			System.out.println(e);
			
		}
		finally
		{
		System.out.println("success");	
			
		}
	}
		
}
