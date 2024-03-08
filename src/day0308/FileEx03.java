package day0308;

import java.io.File;

public class FileEx03 {

	public static void main(String[] args) {
		File f = new File("c:/");
		
		File[] listFile = f.listFiles();
		
		for(File f1 : listFile) {
			System.out.println(f1.getName()+" <= 이것은 파일인가? : "+f1.isFile());
										// 파일이름가져오기								// 파일 여부
		}						
	}

}
