package day0307;

/*
 		프로세스
 			- 운영체제에서 실행중인 하나의 어플리케이션.
 			- 하나의 어플리케이션은 다중 프로세스를 만들기도 함
 				ex) 크롬 창 두개이상 사용
 			- 멀티 프로세스들은 운영체제로부터 각자의 메모리를 할당 받아 실행
 				: 서로 독립적이다.
 			
 		멀티 태스킹 
 			- 두가지 이상의 작업을 처리하는것
 			- 꼭 멀티 프로세스를 의미하는 것은 아니다
 			- 한프로세스 내에서 멀티태스킹을 하도록 만들어진 어플리케이션
 				ex ) 카톡 -> 채팅, 파일 업로드
 		
 		멀티 스레드
 			- 하나의 프로세스가 두가지 이상의 작업을 처리하는것<----------------------------	|
 																												|
 		스레드 																								|
 			- 한가지 작업을 실행하기 위해 순차적으로 실행한 코드를 실처럼 이어놓았다라는뜻		|
 			- 하나의 스레드는 하나의 코드 실행의 흐름													|
 			- 하나의 프로세스 내에서 스레드가 두개라면 두개의 코드 실행이 생긴다는 의미--------	|
 			
 			- 멀티 프로세스가 어플리케이션 단위의 멀티 태스킹 이라면,
 				멀티 스레드는 어플리케이션 내부의 멀티 태스킹 이다.
 		
 		메인 스레드 
 			- 모든 자바 어플리케이션은 메인 스레드가 메인메서드를 실행하면서 시작이 된다.
 			- 메인스레드는 메인 메서드의 코드를 순차적으로 실행,
 				메인메서드의 마지막 코드를 실행을 하거나 return 문을 만나면 종료된다.
 			- 필요에 따라 작업 스레드들을 만들어서 병렬로 코드를 실행 할 수 있다.
 				즉, 멀티 스레드를 생성해서 멀티 태스킹 수행
 			- 멀티스레드 어플리케이션에서 실행 중인 스레드가 하나라도 있다면
 				이 프로세스는 종료되지 않음
 		
 		작업 스레드 생성과 실행
 			- 자바에서는 메인 스레드 반드시 존재!
 			- 메인 이외의 추가적인 병렬 작업의 수만큼 스레드를 생성하면 된다.
 			- 객체로 생성되기 때문에 클래스가 필요.
 			
 			1) java.lang.Thread 클래스를 직접 객체화하여 생성.
 				- 스레드 객체 생성 시에 반드시 Runnable 인터페이스 타입의 구현 객체를 생성해야한다
 					Thread t = new Thread(Runnable r);
 					먼저, 매개값으로 받을 Runnable 인터페이스 타입의 구현객체를 생성해야한다.
 				- Runnable 은 작업 스레드의 실행 코드를 가지고있다 - > 객체
 				- Runnable 은 run() 를 구현해야함 -> 실행 코드가 들어갈 부분.
 				
 				- 작업스레드가 생성되는 즉시 실행 되는것은 아니다.
 					start() 메서드를 호출해야만 실행됌
 					t.start();
 					
 			2) Thread 를 상속해서 하위클래스 생성
 				- Thread 클래스를 상속 후에 run() 재정의 해서
 				 스레드가 실행할 코드를 작성
 				 
 			class	 작업스레드 extends Thread{
 				 		...
 						public void void();{
 						}
 					
 			}
 		일반적인 객체 생성과 방법 동일
 			Thread t = new 작업 스레드();
 			
 			t.start(); // 작업스레드 자신의 run() 메서드를 실행함
 */
public class ThreadEx00 {

	public static void main(String[] args) {

	}

}
