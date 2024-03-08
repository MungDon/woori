package day0307;

class Thread_1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}

}

class Thread_2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <300; i++) {
			System.out.print("|");
		}
	}
}

public class ThreadEx03 {
	public static void main(String[] args) {
		// 작업스레드 객체 생성
		Thread_1 th1 = new Thread_1();	
		Thread_2 th2 = new Thread_2();
		
		th1.start();	//th1 작업스레드 객체의 run 메서드 실행
		try {
			th1.join();	// 지정한 작업스레드의 동작이 끝날 때 까지 기다려줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();	// th2 작업스레드 객체의 run 메서드 실행
	}
}
