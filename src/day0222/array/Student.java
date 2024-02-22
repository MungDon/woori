package day0222.array;

public class Student {
	private String name;
	private int num;
	
	//생성자
	public Student(){}
	
	public Student(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	public void studentInfo() {
		System.out.println("학생 이름 : "+name+", 학생 번호 : "+num );
	}
}
