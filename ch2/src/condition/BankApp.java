package condition;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //잔고
		Scanner sc = new Scanner(System.in);
	
		
		while (run) {
			System.out.println("------------------------------\t");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료\t")	;
			System.out.println("------------------------------\t");
			System.out.println("선택>");
			
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				// 예금액 입력 받은 후 잔고에 추가
//				int deposit = sc.nextInt();
//				balance = balance + dep선osit;
				System.out.printf("예금액 >>");
				// int money = sc.nextInt(); balance += money;
				balance += sc.nextInt();
				break;
			case 2:
				// 출금액 입력받은 후 잔고에서 차감
				System.out.printf("출금액 >>");
				balance -= sc.nextInt();
				break;
			case 3:
				// 잔고 출력
				System.out.println("잔고액 >> " + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				break;
			}
			
		}


	}

}
