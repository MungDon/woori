package day0308;

import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		File f = new File("c:/");
		String[] list = f.list();
		for(String s : list) {
			System.out.println(s);
		}
	}

}
