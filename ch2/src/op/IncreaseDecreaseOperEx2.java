package op;


// 증감연산자는 앞, 뒤에 올수도 있음
// 대입연산자랑 만날때 ++x 앞쪽에 오는 경우는 증감을 먼저 하고 대입이 일어남
// int result1 = ++x + 20;
// ① ++x = 1 + 1 => 증감 먼저
// ② ① + 20 = 2 + 20
// ③ =(대입) 연산자 실행 => 결과 22

//				 x++ 뒤쪽에 오는 경우는 대입을 하고 증감이 일어남
// int result1 = x++ + 20;
// ① x + 20
// ② = (대입) 연산자 실행 => 결과 21
// ③ x++ => 이후 증감


public class IncreaseDecreaseOperEx2 {

	public static void main(String[] args) {// TODO Auto-generated method stub
		int x = 1;
		int y = 1;
		
//		int result1 = ++x + 20; //22 ++x = x + 1
		int result1 = x++ + 20; // 21
		System.out.println("result1 = " + result1);
		
//		int result2 = --y + 20; //20 --y = y - 1
		int result2 = y-- + 20; //21
		System.out.println("result2 = " + result2);
	}

}
