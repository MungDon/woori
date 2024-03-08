package day0308;

import java.io.File;

public class FileEx01 {
	public static void main(String[] args) {
		File f = new File("c:/abs.txt");
		boolean result = false;
		
		try {
//			result = f.createNewFile();	// 새파일 생성
			result = f.delete();
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
