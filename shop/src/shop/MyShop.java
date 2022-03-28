package shop;

import java.util.Iterator;
import java.util.Scanner;

public class MyShop implements IShop {
	
	Scanner sc = new Scanner(System.in);
	
	// 계정 선택에서 선택한 사용자 정보 담기
	private int selUser;
	
	private String title;
	private User users[] = new User[2];
	// 부모로 배열을 잡으면 tv,cellphone 부모의 배열에 담을 수 있음
	private Product[] products = new Product[5];
	private Product[] carts = new Product[10];
	
	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public void genUser() {
		//User 객체를 이용해서 2명을 생성
		//User 배열
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);

	}

	@Override
	public void genProduct() {
		// 핸드폰 3개 생성, 스마트 TV 2개 생성
		// 핸드폰 생성
		products[0] = new CellPhone("갤럭시노트", 1500000,"SKT");
		products[1] = new CellPhone("아이폰12", 1300000,"KT");
		products[2] = new CellPhone("아이폰11", 900000,"LGU+");
		products[3] = new SmartTV("삼성울트라HD", 2500000, "4K");
		products[4] = new SmartTV("LG스마트", 1400000, "1080P");

	}

	@Override
	public void start() {
		System.out.println(title + ": 메인화면 - 계정선택");
		System.out.println("=========================");
		int i = 0;
		for(User user:users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
		
//		for (int i = 0; i < users.length; i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());
//		}
		System.out.println("[x] 종 료");
		System.out.println("선택 : ");
		String input = sc.nextLine();
		
		
		
		
		// switch 구문
		switch (input) {
		// input : 0, 1
		case "0": case "1":
			System.out.println("### " + input + "선택 ###");
			
			//selUser 멤버 변수 : 클래스 변수
			selUser = Integer.parseInt(input);
			
			// 0, 1 => product list() 메소드 호출
			productList();
			break;
			// input x, X
			// x(X) => 프로그램 종료
		case "x" : case "X":
			System.out.println("프로그램 종료");
			break;
			// 다른게 입력되면 => 입력값을 확인해주세요
			//               계정선택 화면 보여주세요.
		default:
			System.out.println("입력값을 확인해주세요");
			start();
			break;
		}

	}
	public void productList() {
		System.out.println(title + ": 상품 목록 - 상품 선택");
		System.out.println("==========================");
		int i = 0;
		for (Product p:products) {
			System.out.printf("[%d]",i++);
			p.printDetail();
		}
//		for (int i = 0; i < products.length; i++) {
//			System.out.printf("[%d] %s",i);
//			products[i].printDetail();
//		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.println("선택");
		String input = sc.nextLine();
		
		//input :  h : 계정선택 c : 체크아웃(checkOut 호출)
		//         0 ~ 4 상품(장바구니 담고 다시 한번 상품 목록 보여주기)
		
		switch (input) {
		// 0~4 장바구니 담고 다시 한번 목록 화면 보여주기
		case "0": case "1": case "2": case "3": case "4": 
			for (int j = 0; j < carts.length; j++) {
				if (carts[j] == null) {
					carts[j] = products[Integer.parseInt(input)];
					break;
				}
			}
			productList();
			break;
		case "h" :
			start(); //start()호출
			break;
		case "c" :
			checkOut(); //checkOut()호출
			break;
		default:
			System.out.println("메뉴를 확인해주세요");
			productList(); //productList()호출
			break;
		}
			
	}
	public void checkOut() {
		System.out.println(title + ": 체크아웃");
		System.out.println("==========================");
		
		int i = 0;
		int sum = 0;
		for (Product p:products) {
			if(p!=null) {
				System.out.printf("[%d] %s(%d)\n",i++,p.getName(),p.getPrice());
				sum += p.getPrice();
			}
		}
		System.out.println("결제 방법 : "+users[selUser].getPayType());
		System.out.println("합계 : " + sum + "원 입니다.");
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String input = sc.nextLine();
		
		// input : p, q
		switch (input) {
		// p : 이전화면 productList()
		case "p":
			productList();
			break;
		// q : 결제가 완료되었습니다. 감사합니다.
		case "q":
			System.out.println("결제가 완료되었습니다. 감사합니다.");
			break;
		default:
			checkOut();
			break;
		}
		
	}


}
