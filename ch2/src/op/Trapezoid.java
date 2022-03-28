package op;

public class Trapezoid {

	public static void main(String[] args) {
		// 사다리꼴 넓이 구하기
		// 윗변 = 5, 아랫변 = 10, 높이 = 7로 변수 선언하기
		// (윗변+아랫변) * 높이 /2

		// 넓이 구하기
		
		int lenfthTop = 5;
		int lenfthBottom = 10;
		int height = 7;
		
		double trapezoiArea = (double)(lenfthTop + lenfthBottom) * height / 2;
		System.out.println("사다리꼴 넓이 : " + trapezoiArea);
				
	}

}
