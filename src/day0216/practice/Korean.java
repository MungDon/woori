package day0216.practice;

public class Korean {
	// 변수
	String nation = "korea"; 		//모든 객체에 동일하게 값이 들어감
	
	String name;						
	int num; 
	//생성자
	Korean(String name, int num){ // 지역변수뇬
		this.name = name; //this는 해당 클래스를 의미
		this.num = num;
	} 
}
