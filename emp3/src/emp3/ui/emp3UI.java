package emp3.ui;

import java.util.Scanner;

public class emp3UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println("=====================================");
			System.out.println("1. Emp 전체 조회");
			System.out.println("2. Emp 사원 조회");
			System.out.println("3. Emp 사원 정보 수정");
			System.out.println("4. Emp 사원 탈퇴");
			System.out.println("5. Emp 사원 추가");
			System.out.println("6. 종료");
			System.out.println("=====================================");
			System.out.println();
			
			System.out.print("메뉴선택 >> ");
			int no = Integer.parseInt(sc.nextLine());

	}

}
