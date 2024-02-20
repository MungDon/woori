package day0213.conditional;

public class SwitchEx02 {
	public static void main(String[] args) {
/*
		int rank = 1;
		char medalColor;
		switch(rank){
			case 1:
				medalColor = 'G';
				break;
			case 2:
				medalColor = 'S';
				break;
			case 3:
				medalColor = 'B';
				break;
			default:	// if문의 else와 같은 역할. 생략 가능
				medalColor = 'A';
		}
		System.out.println(rank+"등 메달의 색은 "+medalColor+" 입니다.");
*/

/*
		break;문이 없으면
		해당 case에서 대입이 된 후
		이후의 코드들 진행
		마지막에 대입된 값이 출력.
*/

		int rank = 1;
		char medalColor;
		switch(rank){
			case 1:
				medalColor = 'G';
				
			case 2:
				medalColor = 'S';
				
			case 3:
				medalColor = 'B';
				
			default:		// 위치 상관없음
				medalColor = 'A';
		}
		System.out.println(rank+"등 메달의 색은 "+medalColor+" 입니다.");
	}
}