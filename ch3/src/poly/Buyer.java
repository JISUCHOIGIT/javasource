package poly;

public class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	
	// 배열생성
	// product 안에는 자식 tv,computer,audio가 있어서 아래와 같이 배열이 가능
	Product items[] = new Product[10];
	// Tv 
	Tv tv[] = new Tv[10];
	
	
	
	
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[i++] = p;
		System.out.println(p + " 을/를 구매하였습니다.");
	}
}
