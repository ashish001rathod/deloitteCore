package deloittecore;

public class LibraryDetails extends Student{
	
	public LibraryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LibraryDetails(int regno, String stdname, String group) {
		super(regno, stdname, group);
		// TODO Auto-generated constructor stub
	}
	public LibraryDetails(int regno, String stdname, String group, int booksDue){
		super(regno, stdname, group);
		this.booksDue=booksDue;
	}
	protected int booksDue;
public void output1(){
	System.out.println("from middle class");//"Books Due= "+booksDue);
}

}
