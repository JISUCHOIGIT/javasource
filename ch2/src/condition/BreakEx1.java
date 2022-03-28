package condition;

public class BreakEx1 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) { // 조건이 맞을때까지 무한반복
			if (sum > 100) {
				break; // while문 종료
			}
			++i;
			sum += i;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
