package pattern.action;

public class ActionFactory {
	//SingleTon 객체 생성 : 객체를 1개만 생성하고 공유
	//default 생성자 : private, 다른 생성자는 제공 안함
	//getInstance()
	
	private static ActionFactory af;
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() { //ActionFactory가 private으로 객체 생성시 ActionFactory getInstance로 생성
		if(af == null) {
			af = new ActionFactory();
		}
		return af;
	}
	
	Action action = null;
	public Action action(String cmd) {
		if(cmd.equals("/select.do")) {
			action = new SelectAction();
		} else if(cmd.equals("/insert.do")) {
			action = new InsertAction();
		} else if(cmd.equals("/login.do")) {
			action = new LoginAction();
		}
		// 생성한 action 리턴
		return action;
	}

}
