package day0308;

import java.io.File;

public class FileEx04 {
	public static void main(String[] args) {
		File f = new File("c:/test.txt");
		System.out.println("실행할수있냐? "+f.canExecute());
		System.out.println("읽을 수 있냐? "+f.canRead());
		System.out.println("편집 할 수있냐? "+f.canWrite());
		System.out.println("파일이냐? "+f.isFile());
		System.out.println("폴더냐? "+f.isDirectory());
		System.out.println("이름은? "+f.getName());
		System.out.println("파일 안 내용의 개수는? "+f.length());

	}
}
