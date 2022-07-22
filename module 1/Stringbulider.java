public class Stringbulider 
{
	public static void main(String[] args)
	{
		String s1="gopal";
		String s2="malviya";
		
		String s3=s1+s2;
		System.out.println(s3);
		
		//concat
		String s4=s1.concat(s2);
		System.out.println(s4);
		
		//campair
		
		String s5="Gopal";
		String s6="Kothi";
		String s7="Sanjay";
		String s8="gopal";
		String s9="GOPAL";
		
		System.out.println(s5.equals(s8));
		System.out.println(s5.equals(s9));
		System.out.println(s5.equals(s8));
	
		
		System.out.println(s5.compareTo(s9));
		System.out.println(s5.equalsIgnoreCase(s8));
		
		System.out.println(s5==s7);
		System.out.println(s5==s8);
		System.out.println(s5==s6);
		
		String s10=("sachin");
		String s11=new String("sachin");
		
		System.out.println(s10.compareTo(s11));
		System.out.println(s10==s11);
		
		String s12=" sps ";
		System.out.println(s12);
		System.out.println(s12.trim());
		
		String s13="abcd";
		String s14="xyz";
		
		System.out.println(s13.toLowerCase());
		System.out.println(s14.toUpperCase());
		
		String s15="python is programing language";
		String ans=s15.replace("python","java");
		System.out.println(ans);
		
		String s16="tops";
		System.out.println(s16.charAt(2));
		
		System.out.println(s16.startsWith("t"));
		System.out.println(s16.endsWith("h"));
	}
}
