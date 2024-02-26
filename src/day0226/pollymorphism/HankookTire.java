package day0226.pollymorphism;

public class HankookTire extends Tire{
	//변수
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		//조상클래스에 기본 생성자가 없기 때문에 호출 해준다
		super(location, maxRotation);
	}
	
	// 메서드
	// 출력 내용을 달리하기 위해 오버라이딩함
	@Override
	public boolean roll() { 
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : "+(maxRotation - accumulateRotation)+" 회");
			return true;
		} else {
			System.out.println("***"+location+"HankookTire 펑크 ***");
			return false;
		}
	}
	
	}


