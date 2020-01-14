package deloittecore;
//In interface methods are by default public and abstract. Data declarations are by default static and final.
public interface Arithmetic {//Functional interface: only one abstract method ; can have multiple default methods.
	int add(int x, int y);
	default void output() {
		System.out.println("it is default method");
	
	}

}
