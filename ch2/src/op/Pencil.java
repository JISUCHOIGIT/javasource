package op;
// 변수명
// 소문자로 시작(대소문자 구별) - ex) fileName filename과는 다른 변수명
// 두개의 단어가 붙을 경우 첫 문자를 대문자로 한다. firstName, maxSpeed
// $, _ 로 시작하는 것은 허용
// 

public class Pencil {

	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생 당 몇개를 가질 수 있고
		// 최종적으로 몇 개가 남는지 출력하시오.
		// 변수 사용, 산술 연산자 사용
		
		int pens = 534;
		int stu = 30;
		
		int result1 = pens / stu; // 똑같이 나눈 갯수
		int result2 = pens % stu; // 나누고 나서 남은 연필 수
		
		System.out.println("학생 한 명 당 연필 개수: " +(pens/stu));
		System.out.println("나머지 연필 개수: " +(pens%stu));
		
		System.out.println("학생 당 " + result1 + "개를 가질 수 있고 " + result2 + "개가 남습니다.");

	}

}
