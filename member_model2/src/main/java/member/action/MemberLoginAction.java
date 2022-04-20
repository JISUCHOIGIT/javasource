package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import member.dto.MemberDTO;
import member.service.MemberLoginService;

public class MemberLoginAction implements Action {

	private String path;
	
	public MemberLoginAction(String path) {
		super();
		this.path = path;
	}

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("current_password");
		
		MemberLoginService service = new MemberLoginService();
		MemberDTO loginDto = service.login(userid, password);
		
		HttpSession session = request.getSession();
		session.setAttribute("loginDto", loginDto);
		
		
		return new ActionForward(path, true);
	}

}
