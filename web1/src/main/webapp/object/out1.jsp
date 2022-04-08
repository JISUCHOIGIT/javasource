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
	4) HttpSession session : http(s) 연결 방식은 stateless를 보완하기 위해 사용 
							 상태유지하지 않기에 보완하기 위해
	5) ServeltContext application : 서버 측 정보와 서버측 자원에 대한 정보 및 해당 어플리케이션의
									이벤트 로그를 다루는 객체
	6) JspWriter out : 자바 변수를 화면 출력시 사용	
	7) Object page : 현재 서비스되고 있는 jsp를 의미			 
--%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=1;i<101;i++){
		out.print(i+" ");
	}
%>
</body>
</html>