package day0220;

import java.util.Date;
/*
 		패키지 
 			- 클래스들의 묶음 폴더
 		임포트
 			 - 기술이 아님 편의를 위한 생겨남.
 			 java.lang 패키지를 제외한 다른 패키지의 클래스 객체 생성 시  사용한다
 			 * : 전체를 의미한다
 */
public class ImportEx01 {
	public static void main(String[] args) {
		Date d = new Date();
		int result = d.getDate();
		System.out.println(result);
//		java.util.Date d1 = new java.util.Date();
//		java.util.Date d2 = new java.util.Date();
//		java.util.Date d3 = new java.util.Date();
//		java.util.Date d4 = new java.util.Date();
//		java.util.Date d5 = new java.util.Date();
	}
}
