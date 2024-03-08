package day0308;

import java.io.FileInputStream;

public class FileInputStreamEx02 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:/test.txt");
			int cnt  = 0;	// 한글자씩 읽기 때문에 int 로 변수 선언
			while((cnt = fis.read()) != -1) {	// read() 메서드로 읽어들여 저장한 값이 -1 아닌동안 반복
				System.out.println((char)cnt);	// 아스키코드값이 나오므로 값의 문자형인 char 자료형으로 형변환 해주어야 한다
			}
//			
//			while(true) {
//				if((cnt = fis.read()) == -1) {
//					break;
//				}
//				System.out.println((char)cnt);
//			
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
