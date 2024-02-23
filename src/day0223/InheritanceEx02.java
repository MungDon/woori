package day0223;
/*student 의 실행클래스*/
public class InheritanceEx02 {

	public static void main(String[] args) {
		Student s = new Student("sung","001022",1);
		System.out.println("이름 : "+s.name);
		System.out.println("주민 번호 : "+s.peopleNo);
		System.out.println("학생 번호 : "+s.studentNo);
	}

}
