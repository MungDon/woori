package day0308;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
/*
 		FileInputStream(File file)		:	file 을 매개변수로 받는다 
 		FileInputStream(String name)		:	파일 이름 name(경로포함) 을 매개변수로 받아 생성.
 */
		
		try {
			fis = new FileInputStream("C:\\test.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NullPointerException e){
				e.printStackTrace();
			}
		}
		System.out.println("end");

		
	}
}
