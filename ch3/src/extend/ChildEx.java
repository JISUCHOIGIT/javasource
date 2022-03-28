package extend;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1(); //parent
		child.method2(); //child
		child.method3(); //child
	}

}
