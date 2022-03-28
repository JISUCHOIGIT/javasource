package api;

import static java.lang.Math.*;

// Math 클래스 이름 사용하지 않아도 됨
// 사용할 메소드들 => static이어야 함

public class MathEx2 {

	public static void main(String[] args) {
		
		// static이기에 Math 클래스이름 넣음
		double val = 90.7552;
		System.out.println("반올림 " + round(val)); //round : 반올림
		System.out.println("올림 " + ceil(val)); //ceil : 올림
		System.out.println("버림 " + floor(val)); //floor : 올림
		
		System.out.println(PI);

	}

}
