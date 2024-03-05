package day0305.api;

class E implements Cloneable {
	public String name;		// 이름
	public int num;			//	번호

	public E(String name, int num) { // 생성자
		this.name = name;
		this.num = num;
	}

	public E getE() {	//클론 생성 
		E clone = null;
		try {
			clone = (E) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}

	public void info() { // 전체 정보
		System.out.println("name : " + name + " num : " + num);
	}

	@Override
	public boolean equals(Object obj) {	 //이름 비교
		if (obj instanceof E) {
			E e = (E) obj;
			if (this.name.equals(e.name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {	// 이름 리턴
		return name;
	}

	@Override
	public int hashCode() {// 번호 리턴
		return num;
	}

}

public class Ex {
	public static void main(String[] args) {
		// 객체 생성
		E e1 = new E("성민형", 10);
		E e2 = new E("민형성", 1);
		E e3 = new E("형민성", 3);

		E clone = e1.getE();	// e1클론 생성

		System.out.println("값 대입전");

		clone.info();	// 클론	전체정보
		e1.info();		// e1 	전체정보

		System.out.println("값 대입 후 ");

		clone.name = e2.name;	//
		clone.num = e3.num;		//클론에 있는 변수 값 변경

		clone.info();					// 클론	전체정보
		e1.info();						// e1 	전체정보

		System.out.println();

		System.out.println(e1);	// 
		System.out.println(e2);	//	 객체의 참조변수가 오버라이딩된 toString 에 의해서 각 객체의 name 을 출력

		System.out.println();

		if (e1.equals(e3)) {			// 오버라이딩된 equals() 에 의해 각 객체의 있는 name 값을 비교
			System.out.println("이름이 같음");
		} else {
			System.out.println("이름이 다름");
		}

		System.out.println();

		System.out.println(e1.hashCode());	// 오버라이딩 된 hashCode에 의해 객체의 num 을 출력
		System.out.println(System.identityHashCode(e1));	// 오버라이딩안된 객체본연의 해시코드 출력
	}
}
