package deloittecore;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="deloitte";
		System.out.println("length="+str.length());
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.charAt(4));
		System.out.println(str.isEmpty());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,7));
		System.out.println(str.toUpperCase());
		System.out.println(str.concat("hyderabad"));
		System.out.println(str);
		System.out.println(str.compareTo("Deloitte"));
		System.out.println(str.equals("deloitte"));
		System.out.println(str.equals("Deloitte"));

	}

}
