package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableObject {

	public static void main(String[] args){
		FileOutputStream fos;
		try {
			fos= new FileOutputStream("D:\\sample\\customer");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			Customer customer1 = new Customer(12345,"deloitte",4000);
			Customer customer2 = new Customer(67890,"manipal",5000);
			oos.writeObject(customer1);
			oos.writeObject(customer2);
			oos.close();
			fos.close();
			System.out.println("ok");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
