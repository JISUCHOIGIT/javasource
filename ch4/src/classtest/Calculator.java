package classtest;

public class Calculator {
	
	// 오버로딩 - 생성자 오버로딩, 메소드 오버로딩
	
	// 메소드 오버로딩 - 매개변수(인자)의 타입, 개수, 순서가 달라야 함	
	// 정사각형 넓이
	double areaRectangle(double width) { //메소드(생성자)
		return width * width;
	}	
	
	// 직사각형 넓이
	double areaRectagnel(double width, double height) { //메소드(생성자)
		return width * height;
	}
}
