<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//값을 가져오는 파일로 여기서 run하면 안됨
	//info.jsp에서 사용자가 넘긴 값 가져오기
	//form 안에 있는 데이터 = 무조건 String
	//String 형태로 값이 넘어옴
	//getParameter에서 String값은 첫번째만 가져옴
	
	request.setCharacterEncoding("utf-8");
	
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	String job = request.getParameter("job");
	//배열형태, 사용자가 여러개의 값을 선택 시 : request.getParameterValues(name값)
	String favorite[] = request.getParameterValues("favorite");
	String gender = request.getParameter("gender");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>
	userid : <%=userid%>
</p>
<p>
	password : <%=password%>
</p>
<p>
	job : <%=job%>
</p>
<p>
	<!-- 배열형태로 Arrays.toString로 출력 사용 -->
	favorite : <%=Arrays.toString(favorite)%>
</p>
<p>
	gender : <%=gender%>
</p>
</body>
</html>