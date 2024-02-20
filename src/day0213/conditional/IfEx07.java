package day0213.conditional;

public class IfEx07 {
	public static void main(String[] args) {
		// 중첩 if문
		int score = 97;
//		String grade;	// 오류
		String grade = "";	// 공백도 문자. 공백으로 초기화
		if(score >= 90){
			// true
			if(score >= 95){
				grade = "A+";
			}else{
				grade = "A";
			}
		}
		System.out.println(grade);
	}
}