package classtest;


// 메소드 2개인 클래스
public class Calculator {
	
	
	// 오버로딩 : 하나의 클래스에 여러 메소드가 존재
	// 생성자 오버로딩 , 메소드 오버로딩
	// 메소드 오버로딩 - 매개변수(인자) 타입, 개수, 순서가 달라야 함
	
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width,double height) {
		return width * height;
	}
	
}
