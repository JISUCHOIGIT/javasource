<%@page import="member.dto.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// loginForm에서 넘긴 값 가져오기
	String userid = request.getParameter("userid");
	String password = request.getParameter("current_password");
	
	// db 작업
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	MemberDTO loginDto = dao.isLogin(userid, password);
	
	JdbcUtil.close(con);
	
	// 페이지 이동
	// 실패시 : loginForm , 성공시 : index.jsp
	String path = "loginForm.jsp";
	if(loginDto != null) {
		session.setAttribute("loginDto", loginDto);
		
	} 
	
	/*else {
		path= "loginForm.jsp";
	}*/
	
	// 1. 아무거나 담지 않거나
	// 2. session 값을 담았을 경우
	response.sendRedirect(path);
	




%>