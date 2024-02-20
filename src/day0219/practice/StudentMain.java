package day0219.practice;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name);

		s1.setName("성민형");
		String name = s1.getName();
		System.out.println(name);
		
		s1.setAddress("인천광역시");
		String address = s1.getAddress();
		System.out.println(address);
		
		Student s2 = new Student();				// 객체 생성
		
		s2.setName("JSP");
		String name2 = s2.getName();
		System.out.println(name2);
		
		s2.setAddress("서울특별시");
		String address2 = s2.getAddress();
		System.out.println(address2);
		
		//showInfo
		s1.showInfo(); 	// s1 학생 정보 
		s2.showInfo();	// s2 학생 정보
	}

}
