package day0213.conditional;

public class SwitchEx01 {
	public static void main(String[] args) {
/*
		switch-case문
		
*/		
		String position = "과장";
		switch(position){
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			case "대리":
				System.out.println("300만원");
				break;
			default:
				System.out.println("200만원");
		}
	}
}