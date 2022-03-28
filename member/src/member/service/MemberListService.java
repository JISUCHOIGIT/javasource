package member.service;

import java.sql.Connection;
import java.util.List;

import member.dao.MemberDAO;
import member.dto.memberDTO;

import static member.dao.JdbcUtil.*;

public class MemberListService {
	// 비즈니스 로직 호출
	public List<memberDTO> list() {
	
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		List<memberDTO> memberList = dao.getList();
		close(con);
		
		return memberList;
		
		
	}
	
}
