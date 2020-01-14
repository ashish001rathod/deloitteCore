package deloittecore;

public class CommandLinePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer();
		StringBuffer s1=new StringBuffer();
		s.append(args[0]);
		String str1=s.toString();
		//System.out.println(s);
		s1.append(s.reverse());
		//System.out.println(s1);
		//System.out.println(s+"******************");
		//System.out.println(str1+"******************");
		
		//System.out.println(str1);
		String str2=s1.toString();
		//System.out.println(str2);
		//System.out.println(str1.equals(str2));
		if(str1.equals(str2)==true)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");

	}

}
