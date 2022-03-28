package exam;

public class Calculator {
	int a;
	int b;
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	int Add(int a, int b) {
		return a + b;
	}
	
	int Sub(int a, int b) {
		return a - b;
	}
	
	int Mul(int a, int b) {
		return a * b;
	}
	
	int Div(int a, int b) {
		return a / b;
	}
	
}
