package day0223;
/*people 클래스의 자손클래스
 * 
 * 자신객체만 생성되는 것처럼 보이지만
 * 		부모객체 먼저 생성 후 자식 객체 생성(=사람)
 * 
 *  	super();
 *  		생략하면 컴파일러가 자동추가
 *  		조상의 기본 생성자 반드시 존재해야함.
 *  		
 *  		조상에 기본 생성자가 없고 매개변수가 있는 생성자만 있다면
 *  		반드시 매개변수가 있는 생성자를 호출해야함.
 * */
public class Student extends People{
	//변수
	public int studentNo;
	
	
	// 생성자
	public Student(String name, String peopleNo, int studentNo) {
		super(name, peopleNo); // 조상클래스의 기본생성자 없음 -> 반드시 생성자 호출 해야함.
		this.studentNo = studentNo;
	
	}
}
