package day0219.practice;

public class Student {
	
	int studentNumber;
	String name;
	int grade;
	String address;
	
	void setName(String name) { //set() 값을 저장.
		this.name = name;
	}
	
	String getName() {	// get()  값을 꺼낼 때 사용
		return name;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String getAddress() {
		return address;
	}
	
	void showInfo() {
		System.out.println(name+" , "+address); // 이름 , 주소
	}
}
