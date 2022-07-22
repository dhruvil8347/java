import java.io.FileOutputStream;
import java.io.IOException;

public class Fileio 
{
	public static void main(String[] args) throws IOException 
	{
		
		try
		{
			String s = "welcome bhai aavo aavo ";
			try (FileOutputStream fout = new FileOutputStream("f://Dhruvil.txt")) {
				fout.write(s.getBytes());
			}
		} 
		catch (Exception e) 
		{
		
			e.printStackTrace();
			System.out.println("sussess");
		}
	}
	
	
	
	
	
}
