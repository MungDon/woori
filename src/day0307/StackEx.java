package day0307;

import java.util.Stack;

/*
 		Stack
 			- FILO / LIFO : First In Last Out
 			- 순서대로 쌓임. 인덱스없음
 			- push()  	:  	값 넣기
 			- peak()	:	위에 값 확인
 			- pop()		:	꺼내거 제거 -> 완전 제거
 */
public class StackEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("1");
		st.push("2");
		st.push("3");
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st.peek());
		
		st.pop();
		st.pop();
		st.push("5");
		System.out.println(st.peek());
		
		System.out.println(st.isEmpty());		
	
	}
}
