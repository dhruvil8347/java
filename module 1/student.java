import java.io.Serializable;

public class student 
{
	public class Student implements Serializable
		{
			int id;
			String name;
		}
	private int id;
	private String name;
		 public student (int id ,String name) 
		 {
			this.id=id;
			this.name=name;
		 }
}
