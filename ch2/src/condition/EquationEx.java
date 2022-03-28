package condition;

public class EquationEx {

	public static void main(String[] args) {
		// 4x + 5y = 60 => 반복
		// x,y는 10이하의 자연수 => 조건
		
		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				if (4*x + 5*y == 60) {
					System.out.printf("(x = %d, y = %d)\n",x,y);	
				}
			}
			
		}

	}

}
