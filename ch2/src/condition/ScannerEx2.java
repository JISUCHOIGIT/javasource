package condition;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번재 수 입력 >>");
//		int num1 = sc.nextInt(); // nextInt + nextLine 같이 사용할 수 없음, nextLine으로 동일화하고 
//		                            Integer.parseInt 사용해야함
		int num1 = Integer.parseInt(sc.nextLine()); // sc.nextLine = 문자 => 숫자
		
		System.out.print("두번재 수 입력 >>");
//		int num2 = sc.nextInt();
		int num2 = Integer.parseInt(sc.nextLine());
		
//		Integer.parseInt("35"); // "35" => 35 문자를 숫자로 바꿈
		
		System.out.print("사칙 연산(+,-,*,/,%) 중 하나 입력 >> "); //String
		String op = sc.nextLine();
		//nextLine()을 사용하면 그 엔터가 해당 메서드의 입력으로 처리되어서 입력이 종료되는 문제가 발생한다.
		
		// + : 연결(문자열), + : 덧셈
		
		int result = 0;
		
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
			
		case "-":
			result = num1 - num2;
			break;
			
		case "*":
			result = num1 * num2;
			break;
			
		case "/":
			result = num1 / num2;
			break;

		case "%":
			result = num1 % num2;
			break;
			
		default:
			break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,result);
		
	}

}
