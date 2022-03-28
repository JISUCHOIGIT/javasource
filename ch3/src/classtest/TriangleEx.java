package classtest;

public class TriangleEx {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 5);

		System.out.println("너비 : " + triangle.getArea()); // 메소드 호출
		
		double getArea = triangle.getArea();
		System.out.println("너비 : " + triangle.getArea());
		
	}

}
