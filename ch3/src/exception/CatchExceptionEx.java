package exception;

// catch (Exception e) {} : 모든 Exception 처리 가능

public class CatchExceptionEx {

	public static void main(String[] args) {
		try {
			
			// ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			
			// NumberFormatException
			int value1 = Integer.parseInt(data1); //"a100" -> a때문에 정수로 바꾸지 못함
			int value2 = Integer.parseInt(data2); //"100" -> error 없음
			
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // 2개의 조건 같이 한꺼번에 기재 가능
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변경할 수 없습니다..");
		} 

	}

}
