package member.action;

import member.action.MemberActionFactory;

public class MemberActionFactory {
	private static MemberActionFactory baf;
	
	private MemberActionFactory() {}
	
	public static MemberActionFactory getInstance() {
		if(baf == null) {
			baf = new MemberActionFactory();
		}
		return baf;
	}
	Action action = null;
	public Action action(String cmd) {
		if(cmd.equals("/login.do")) {
			action = new MemberLoginAction("/view/loginForm.jsp");
		} else if(cmd.equals("/logout.do")) {
			action = new MemberLoginAction("/view/loginForm.jsp");
		} else if(cmd.equals("/leave.do")) {
			action = new MemberLeaveAction("/index.jsp");
		} else if(cmd.equals("/modify.do")) {
			action = new MemberModifyAction("/view/loginForm.jsp");
		} else if(cmd.equals("/join.do")) {
			action = new MemberJoinAction("/view/loginForm.jsp");
		} else if(cmd.equals("/checkId.do")) {
			action = new MemberCheckIdAction("/view/checkId.jsp");
		}
		return action;
	}

}
