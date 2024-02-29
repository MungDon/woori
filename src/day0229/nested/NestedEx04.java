package day0229.nested;

class N{
	void add() {			// 메서드
		class M{			// 지역클래스
			int x = 100;	
		}
		M m = new M();					// 해당 지역 내에서만 사용 가능하다/ 메서드 내부에서 생성하고 사용해야함
		System.out.println(m.x);
	}
}

public class NestedEx04 {

	public static void main(String[] args) {
		N n = new N();
		n.add();
	}

}
