package day0213.ex;

public class IfEx08 {
	public static void main(String[] args) {
		int score = 88;
		String result;
		if(score >= 90){
			if(score >= 95){
				result = "A+";
			}else{
				result = "A";
			}
		}else{
			if(score >= 85){
				result = "B+";
			}else{
				result = "B";
			}
		}
		System.out.println(score+"점은 "+result+"학점 입니다.");
	}
}