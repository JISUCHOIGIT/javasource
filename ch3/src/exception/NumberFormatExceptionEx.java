package exception;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String data1 = "200";
		String data2 = "100";
		
		try {
			int value1 = Integer.parseInt(data1); //"a100" -> a때문에 정수로 바꾸지 못함
			int value2 = Integer.parseInt(data2); //"100" -> error 없음
			
			System.out.println(value1+value2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외 여부와 상관없이 무조건 실행해야 하는 코드
			System.out.println("종료");
		}
		
		
	}

}
