package extend;

public class SubListStringEx {

	public static void main(String[] args) {
		SubListString sub = new SubListString();
		sub.list(); //무조건 자식 메소드가 실행된다
		
		sub.writer();
	}

}
