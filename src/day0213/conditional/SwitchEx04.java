package day0213.conditional;

public class SwitchEx04 {
	public static void main(String[] args) {
		// 5층 건물
		// 1층 약국 , 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스장
		// 5층 헬스장입니다
		int floor = 5;
		String ment = "";

		switch(floor){
			case 1:
				ment = "1층 약국";
				break;
			case 2:
				ment = "2층 정형외과";
				break;
			case 3:
				ment = "3층 피부과";
				break;
			case 4:
				ment = "4층 치과";
				break;
			case 5:
				ment = "5층 헬스장";
				break;
		}
		System.out.println(ment+" 입니다");
	}
}