package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		try{
			FileInputStream fis= new FileInputStream("D:\\sample\\resume");
			FileOutputStream fos= new FileOutputStream("C:\\sample\\resume1");
			int x;
			while((x=fis.read())!=-1)
				fos.write((char)x);
			fos.close();
			fis.close();
			System.out.println("success");
		}
			catch(IOException e){
				e.printStackTrace();
			}
	}

}
