package day0307;
/*
 		Sleep()
 			- 실행중인 스레드를 일정시간 멈추게 함.
 */

class Thread001 extends Thread {

	@Override
	public void run() {
		for(int i = 0; i<300; i++) {
			System.out.print("-");
		}
		System.out.println("<<th1 종료>>");
	}
	

}

class Thread002 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println("<<th2 종료>>");	
	}
}

public class ThreadEx04 {
	public static void main(String[] args) {
		// 작업 스레드 객체 생성
		Thread001 th1 = new Thread001();
		Thread002 th2 = new Thread002();
		
		

		th1.start(); 	// 작업스레드 run 메서드 실행
		

		
		th2.start();	// 작업스레드 run 메서드 실행
		
		try {
			th2.sleep(3000);	// 코드가 실행되면 3초정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		System.out.println("<<메인 종료>>");
	}
}
