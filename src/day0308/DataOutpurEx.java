package day0308;

import java.io.*;

/*
 		Data
 			- 기본 자바의 데이터 유형을 읽고 쓸 수 있다.
 */
public class DataOutpurEx {

	public static void main(String[] args) {
		try {
			File f= new File("c:/bbb.txt");
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBoolean(true);
			dos.writeInt(100);
			dos.writeDouble(5.7);
			dos.writeChar(66);
			dos.writeChars("hihi");
			System.out.println("생성완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
