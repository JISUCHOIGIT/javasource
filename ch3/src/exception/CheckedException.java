package exception;

public class CheckedException {

	public static void main(String[] args) {
		try { //Unhandled exception type ClassNotFoundException
			Class.forName(null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
