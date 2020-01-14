package deloittecore;
import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<>();
		int n=1;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("If want to add more data to list; Enter 1; else enter 2");
		n=sc.nextInt();
		while(n==1){
			
			int code=0;
			String name="";
			double salary=0;
			System.out.println("Enter the employee code: ");
			code=sc.nextInt();
			System.out.println("Enter the employee name: ");
			name=sc.next();
			System.out.println("Enter the employee salary: ");
			salary=sc.nextDouble();
			
		emplist.add(new Employee(code,name,salary));
		System.out.println("If want to add more data to list; Enter 1; else enter 2");
		n=sc.nextInt();
		}
		for(Employee emp: emplist)
			System.out.println(emp.getEmpCode()+" "+emp.getEmpName()+" "+emp.getSalary());

	}

}
