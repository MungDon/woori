package day0213.conditional;

public class IfEx06 {
	public static void main(String[] args) {
		// 점수에 따라 등급이 나오게
		// int score, char grade
		// 90 , 80 , 70, 60 / A ~ F
		// 결과 B나오게 구성
		int score = 88;
		char grade;
		if(score >= 90){
			grade='A';
		}else if(score >= 80){
			grade='B';
		}else if(score >= 70){
			grade='C';
		}else if(score >= 60){
			grade='D';
		}else{
			grade='F';
		}
		System.out.println(score+"점은 "+grade+"등급 입니다.");
	}
}