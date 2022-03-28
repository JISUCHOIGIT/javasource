package classtest;

public class NumbersEx {

	public static void main(String[] args) {
		// 배열 선언 후 객체 생성
		// Numbers 객체 생성 후 합계, 평균 구하기
		
//		int arr[] = {15,35,25,99,26,33};
//		Numbers number = new Numbers(arr);
		
		Numbers numbers = new Numbers(new int[] {15,35,25,99,26,33});
		
		System.out.println("합계 : " + numbers.getTotal()); // 메소드 호출
		System.out.printf("평균 : %.2f " , numbers.getAvg()); // 메소드 호출

	}

}
