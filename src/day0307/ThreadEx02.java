package day0307;
/*
 		join() 
 			- 스레드는 다른 스레드와 독립적으로 실행하는 것이 기본이지만
 				다른 스레드가 종료될 때까지 기다렸다가 실행해야하는 경우도 있음.
 				
 */
public class ThreadEx02 {
	public static void main(String[] args) {
		SumThread st = new SumThread();		// 작업 스레드 객체 생성
		
		st.start();		// st(작업 스레드) 객체 안에 run 메서드 실행
		
		try {
			st.join();	// 작업스레드의 동작이 끝날때 까지 기다려줌 / 예외처리 필수(일반(컴파일) 예외)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : "+st.getSum()); // 반복문이 끝난 sum 값 가져오기
	}
}
