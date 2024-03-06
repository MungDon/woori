package day0306.maps;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("java", "1234");
		hm.put("snug", "5678");
		hm.put("min", "1234");
		hm.put("min", "4567");

		System.out.println(hm);

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("아이디를 입력해주세요");

			System.out.println("아이디 : ");
			String id = sc.nextLine().trim();

			System.out.println("비밀번호 : ");
			String pw = sc.nextLine().trim();
			try {
				if (!hm.containsKey(id)) {
					throw new Exception("아이디가 틀렸습니다");
				} else if (!hm.get(id).equals(pw)) {
					throw new Exception("비밀번호가 틀렸습니다");
				}
				System.out.println("로그인성공");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
