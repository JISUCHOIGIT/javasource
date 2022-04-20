package member.action;

import java.sql.Connection;
import static member.dao.JdbcUtil.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MemberLogoutAction implements Action {
	
	private String path;

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto");
		
		return new ActionForward(path, true);
	}

}
