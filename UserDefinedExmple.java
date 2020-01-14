package deloittecore;

public class UserDefinedExmple {

	public static void main(String[] args) {
		int empcode=1234;
		int code=Integer.parseInt(args[0]);
		try{
			if(code!=empcode)
				throw new EmployeeNotFoundException();
			System.out.println("Employee exists.");
		}
		catch(EmployeeNotFoundException e){ 
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
