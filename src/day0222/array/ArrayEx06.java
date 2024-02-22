package day0222.array;

public class ArrayEx06 {

	public static void main(String[] args) {
		Student[] s = new Student[3]; //객체 배열 생성
		
		s[0] = new Student("성",1);		//학생 1 객체 생성 후 값 저장
		s[1] = new Student("민",2);		//학생 2 객체 생성 후 값 저장
		s[2] = new Student("형",3);		//학생 3 객체 생성 후 값 저장
	
		for(int i = 0; i < s.length; i++) {	// 학생전부의 정보를 불러옴.
			s[i].studentInfo();
		}
	
	
	}

}
