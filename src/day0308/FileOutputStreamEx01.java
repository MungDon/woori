package day0308;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
/*FileOutputStream(File f, boolean append) 
 														:	append 기본 값 = false
 														:				true 면 파일의 끝부분에 이어서 작정
 */
		try {
			FileOutputStream fops = new FileOutputStream("c:/aaa.txt",true);
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 >> ");
			String note = sc.nextLine();	// 라인으로 입력받음
			byte[] n = note.getBytes();	// 바이트로 변환
			fops.write(n);						// 변수 넣기
			fops.write(65);	// 아스키 코드를 넣으면 해당되는 값인 char 로 변환
			fops.write(66);
			fops.write(67); 
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
