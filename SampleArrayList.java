package deloittecore;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(567);
		list1.add(34.56);
		list1.add("deloitte");
		list1.add(567);
		list1.add(null);
	    System.out.println(list1+" "+list1.size());
	    list1.add("hyd");
	    list1.add(2,"java");
	    System.out.println(list1+" "+list1.size());
	    list1.remove(new Integer(567));
	    System.out.println(list1+" "+list1.size());
	    Iterator itr=list1.listIterator();
	    while(itr.hasNext()){
	        Object obj=itr.next();
	        if(obj instanceof Double)
	    	System.out.println(obj);
	     }
	}

}
