package shop;

public abstract class Product {
	// 일반 클래스 + 추상메서드
	private String name;
	private int price;
	
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	// 상품마다 동일한 내용을 출력
	public void printDetail() {
		System.out.println("상품이름 : " + name);
		System.out.println("상품가격 : " + price);
		
		printExtra();
	}
	// 상품마다 서로 다른 내용이 출력 -> 그래서 구현하지 않음
	// 자식들이 오버라이딩 하기 때문에
	// 추상메소드
	public abstract void printExtra();
	
	
	
}
