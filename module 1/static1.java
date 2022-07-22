public class static1 
{
	 int count = 0;
	public static1() 
	{
		count++;
		System.out.println(count);
		
	}

	public static void main(String[] args) 
	{
		static1 s1 = new static1();
		static1 s2 = new static1();
		static1 s3 = new static1();
		static1 s4 = new static1();
		static1 s5 = new static1();
	
	
	}
}