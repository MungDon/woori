package day0219;

import day0220.AccessEx20;

public class AccessExMain extends AccessEx20{
	public static void main(String[] args) {
		System.out.println(AccessEx.a);		// 모든 접근 허용
		System.out.println(AccessEx.b);		// 같은 패키지 내, 상속 관계 사용가능
		System.out.println(AccessEx.c);		// default 같은 패키지 내 사용가능
		//System.out.println(AccessEx.d);	// 본인 클래스 내에서만 사용가능
		
		
		System.out.println(AccessEx20.a);
		System.out.println(AccessEx20.b);	// 다른패키지라서 에러 ,  extends AccessEx20 상속 받으면 가능
//		System.out.println(AccessEx20.c);	// 다른패키지라서 에러
//		System.out.println(AccessEx20.d);	// 다른 클래스라서 에러
	}
}
