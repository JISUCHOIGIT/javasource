<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- get 방식 : a href 링크는 모두 get , 기본, 입력한 정보가 주소창에 뜸 -->
<!-- post 방식 : form을 body로 폼으로 감싸서 전송하는 형태, 주소줄 암호화 -->
<form action="name_request.jsp" method = "post">
	<div>
		<label>이름</label>
		<input type="text" name="username" id="username" required ="required"/>
	</div>
	<div>
		<button type ="submit">보내기</button>
	</div>
</form>
</body>
</html>