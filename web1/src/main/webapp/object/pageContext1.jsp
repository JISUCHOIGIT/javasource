<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	form method='get' => 한글 처리 가능 / 인코딩 자동적으로 발생
	form method='post' => 직접 인코딩 처리 
	
	jsp 내장객체
	request : 변수명 / 바꾸지 못함
	1) HttpSerlveltRequest request : 사용자의 요청을 가져올 수 있음
	2) HttpServletResponse response : 사용자에게 응답할때 사용
	3) javax.servlet.PageContext : 다른 내장 객체에 접근 가능한 객체
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.forward("forward1.jsp");
%>
</body>
</html>