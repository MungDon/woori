package day0308;

import java.io.*;

public class DataInputpurEx {
	public static void main(String[] args) {
		try {
			File f = new File("c:/bbb.txt");
			FileInputStream fis = new FileInputStream(f);			
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readLine().trim());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
