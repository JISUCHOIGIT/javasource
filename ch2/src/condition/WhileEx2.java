package condition;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 합 구하기
		
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
