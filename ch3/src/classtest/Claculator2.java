package classtest;

public class Claculator2 {
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y); //17
		
		return sum / 2; // 17/2 = 8.0
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 = "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
