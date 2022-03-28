package condition;

public class PrimeNumber {

	public static void main(String[] args) {
		// 1 ~ 100 숫자 중에서 소수 구하기
		// 1과 자기 자신으로만 나누어 지는 수를 구하기
		
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) { // 나눠지는게 자기 자신과, 1일 경우 2개만 될 경우 출력
				System.out.print(i+ " ");
			}
			count = 0; // count 초기화
		}
		
	}

}
