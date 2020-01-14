package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableObject {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois= null;
		try {
			fis = new FileInputStream("D:\\sample\\customer");
			ois = new ObjectInputStream(fis);
			Object obj;
			while((obj=ois.readObject())!=null){
				Customer cust =(Customer) obj;
				System.out.println(cust.getCustid()+" "+cust.getCustname()+" "+cust.getComm());				
			}
		} 
		catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			ois.close();
			fis.close();
	        System.out.println("Done");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
