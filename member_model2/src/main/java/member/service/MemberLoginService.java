package member.service;
import static member.dao.JdbcUtil.*;

import java.awt.print.Book;
import java.sql.Connection;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

public class MemberLoginService {
	
	public MemberDTO login(String userid, String password) {
		
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		MemberDTO loginDto = dao.isLogin(userid, password);
		
		close(con);
		
		return loginDto;
	}
	
}
