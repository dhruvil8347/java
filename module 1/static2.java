public class static2 
{
	int id;
	String name;
	static String college="sps";
	
	public static2(int id,String name) 
	{
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
		
	}
	
	static void change()
	{
		//college="iuytr";
	}
	public static void main(String[] args)
	{
		change();
		
		static2 s1 = new static2(101,"heet");
		static2 s2 = new static2(102,"dhruvil");
		
		s1.display();
		s2.display();
		
	}
	
	
	
}
