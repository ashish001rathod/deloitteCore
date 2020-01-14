package deloittecore;

public class CommandLineName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=args[0];
		int l=name.length();
		for(int i=0;i<l;i++)
			System.out.println(name.charAt(i));
		System.out.println();
		for(int i=0;i<l;i++){
			for(int j=0;j<i+1;j++)
			System.out.print(name.charAt(j));
		System.out.println();	
		}

	}

}
