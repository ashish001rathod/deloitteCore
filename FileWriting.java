package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		File file = new File("D:\\sample");
		try{
		FileOutputStream fos= new FileOutputStream("D:\\sample\\resume");
		for(int i=65;i<91;i++)
			fos.write(i);
		fos.close();
		System.out.println("success");
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
