package deloittecore;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	public void output(){
		System.out.println("from super class");//regno+stdname+group);
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int regno, String stdname, String group) {
		super();
		this.regno = regno;
		this.stdname = stdname;
		this.group = group;
	}
	

}
