package exam;

import java.util.Arrays;
import java.util.Scanner;

public class AccountEx2 {
	
	//멤버변수 static : 공유
	private static Account2[] accountArray = new Account2[100]; //배열생성 100개 메모리 연속적으로 생성
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("--------------------------------------------");
			System.out.println("선택 >>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1 ) {
				//계좌생성
				createAccount();
			} else if (selectNo == 2) {
				//계좌목록
				accountList();
			} else if (selectNo == 3) {
				//계좌입금
				deposit();
			} else if (selectNo == 4) {
				//계좌출금
				withdraw();
			} else if (selectNo == 5) {
				//종료
				run = false;
			}
		}
					
		
	}//main end
	
	private static void createAccount() { //메소드 앞에서 private 사용
		System.out.print("계좌번호 입력");
		String ano = sc.nextLine();
		System.out.print("계좌주 입력");
		String owner = sc.nextLine();
		System.out.print("잔액 >> ");
		int balance = Integer.parseInt(sc.nextLine());
		//Account2 객체 생성
		//배열에 담아주기
//		accountArray[0] = new Account2(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account2(ano, owner, balance);
				System.out.println("계좌 생성 완료");
				break;
			}
		}
	}
	private static void accountList() {
		// 지금까지 생성된 모든 계좌목록 보여주기
//		----------------------------
//		계좌번호      계좌주       잔액
//		----------------------------
//		110-11      홍길동	  200000
//		110-22      성춘향	  100000
		
		//반복하지 않아도 되서 for문 밖으로 기재
		System.out.println("--------------------");
		System.out.println("계좌번호   계좌주    잔액");
		System.out.println("--------------------");
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n",
								  accountArray[i].getAno(),
						          accountArray[i].getOwner(),
						          accountArray[i].getBalance()); //ano는 private으로 막아놔서 getter로 접근
			}
		}
	}
	//예금
	private static void deposit() {
		//계좌번호 입력 받기
		System.out.println("계좌번호 입력 >>");
		String ano = sc.nextLine();
		
		//입금액 입력 받기
		System.out.println("입금액 입력 >>");
		int deposit = Integer.parseInt(sc.nextLine());
		
		//입력받은 계좌번호가 배열에 들어있는지 확인
		Account2 account = findAccount(ano);
		
		//account가 null이 아니면 입금 처리
		if (account != null) {
			// 잔액 = 잔액 + 예금액
			// 잔액을 더한 후 변경 = setBalance
			account.setBalance(account.getBalance() + deposit);
		} else {
			System.out.println("계좌번호 확인");
		}	
	}
	private static void withdraw() {
		System.out.println("계좌번호 입력 >>");
		String ano = sc.nextLine();
		
		System.out.println("출금액 입력>>");
		int withdraw = Integer.parseInt(sc.nextLine());
		
		Account2 account = findAccount(ano);
		if(account.getBalance() >= withdraw) {
			if (account != null) {
				account.setBalance(account.getBalance() - withdraw);
			} else {
				System.out.println("잔액 부족");
			} 
		} else {
			System.out.println("계좌번호 확인");
		}
	}
		
	private static Account2 findAccount(String ano) {
		//Account2 배열에서 ano와 동일한 Account2 찾기
		
		//for문
		for (int i = 0; i < accountArray.length; i++) {
			//if(null이 아닌 경우만)
			if (accountArray[i] != null) {
				//if(Account2 배열에서 ano와 동일한 Account2 찾기)
				if (accountArray[i].getAno().equals(ano)) {
					//찾은 Account2를 리턴
					return accountArray[i];
				}
			}
		}
		return null; // 못찾은 경우
	}

}
