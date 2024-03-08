package day0307;

class Thread01 implements Runnable {	//Runnable interface 구현

	@Override
	public void run() {	// 재정의(오버라이딩) : 작업클래스 실행 코드
		for(int i = 0; i <5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("T1 종료");
	}
}

class Thread02 extends Thread{	// Thread 상속

	@Override
	public void run() {	// 재정의(오버라이딩) : 작업클래스 실행 코드
		for(int i =0; i<5; i++) {
			System.out.println(getName());
		}
		System.out.println("T2 종료");
	}
	
}

// 메인 스레드 : 메인 메서드가 실행 하면서 시작
public class ThreadEx01 {
	public static void main(String[] args) {
		Runnable r = new Thread01();	// 생성자에 들어갈 매개값(객체) 생성
		Thread t1 = new Thread(r);		// 스레드 객체를 생성
		
		Thread t2 = new Thread02();	// 일반적인 객체 생성과 동일
		
		t1.start();	//t1 객체 run 메서드 실행
		t2.start();//t2 객체 run 메서드 실행
		
		System.out.println("메인 종료");
		
		
	}
}
