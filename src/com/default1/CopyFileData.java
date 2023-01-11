package com.default1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileData {

	public static void main(String[] args) {

		try(FileInputStream inr = new FileInputStream(new File("E:\\Test\\one.txt"));
				FileOutputStream out = new FileOutputStream(new File("E:\\Test\\Two.txt"));) {
			
			//FileInputStream inr = new FileInputStream(new File("E:\\Test\\one.txt"));
			//FileOutputStream out = new FileOutputStream(new File("E:\\Test\\Two.txt"));
			
			int n;
			while((n = inr.read()) != -1) {
				System.out.println((char) n);
				out.write(n);
			}
			
			inr.close();
			out.close();
			
		}catch(Exception e) {
		}
		
		
		
		
		
	}

}
