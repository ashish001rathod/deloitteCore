package deloittecore;

public class StudentExam extends LibraryDetails{
	public StudentExam(int regno, String stdname, String group, int booksDue, int sub1, int sub2){
		super(regno,stdname,group,booksDue);
		this.sub1=sub1;
		this.sub2=sub2;
	}

	public StudentExam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentExam(int regno, String stdname, String group, int booksDue) {
		super(regno, stdname, group, booksDue);
		// TODO Auto-generated constructor stub
	}
	public StudentExam(int regno, String stdname, String group) {
		super(regno, stdname, group);
		// TODO Auto-generated constructor stub
	}

	private int sub1;
	private int sub2;
	public void output2(){
		int total=sub1+sub2;
		System.out.println("from sub class");//regno+stdname+group+total+booksDue);
	}
	public static void main(String[] args) {
		Student student= new Student();
		LibraryDetails library=new LibraryDetails();
		StudentExam exam=new StudentExam();
		exam.output();

	}

}
