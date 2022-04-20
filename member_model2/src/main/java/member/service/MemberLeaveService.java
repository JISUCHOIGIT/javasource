package member.service;

import java.sql.Connection;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

public class MemberLeaveService {
	
	public boolean leave(String userid, String password) {

		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		boolean result = dao.leave(userid, password);
		
		if(dao.leave(userid, password)) {
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
		
		return result;
		
		
	}

}
