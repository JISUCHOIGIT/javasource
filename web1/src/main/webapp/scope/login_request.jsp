<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String password =request.getParameter("password");

	// 로그인 정보 세션 속성에 담기
	// session 유효 범위를 가짐 + 브라우저 열고 닫기 전까지 유효범위
	//session.setAttribute("userid", userid);
	//session.setAttribute("password", password);
	//setAttribute = object로 돌아감
	session.setAttribute("loginDto", new LoginDto(userid,password));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 정보</h3>
	<p>userid : <%=userid %></p> <!-- getParameter 형식으로 가져옴 -->
	<p>password : <%=password %></p> <!-- getParameter 형식으로 가져옴 -->
	<p>age : <%=request.getAttribute("age") %></p>
	
	<p><a href="login_request2.jsp">이동</a></p>
</body>
</html>