package day0221;

public class TvMain {

	public static void main(String[] args) {
		Tv t =  new Tv(); //Tv객체 생성
		Tv t2 = new Tv("삼성", 65);	// 객체 생성
		
		t.PowerRev(); // 전원 ON
		t.setChannel(3);	// 채널 3	
		
		int channel = t.getChannel(); // 채널정보를 channel 에 저장
		System.out.println(channel);	// 채널 출력
		
		t.channelUP();	//4
		t.channelUP();	//5
		t.channelUP();	//6
		
		channel = t.getChannel();			//channel 정보 가져오고 대입
		System.out.println(channel);	//채널 출력
		
		t.channelDown();	//5
		t.channelDown();	//4
		channel = t.getChannel(); 		//channel 정보 가져오고 대입
		System.out.println(channel);	//채널 출력
	
		t.view(); // t의 tv정보
		System.out.println();
		t2.view();	// t2의 tv정보
		
		t.PowerRev(); // 전원 OFF
		System.out.println();
		t.view(); // t의 tv정보
	}

}
