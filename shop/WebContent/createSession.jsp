<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id="rorod";
	String pwd="1234";
	
	session.setAttribute("idKey", id);
	session.setAttribute("pwdKey", pwd);
%>
세션에 생성되었습니다.<br/>
<a href="viewSessionInfo.jsp">세션 정보를 확인하는 페이지로 이동</a>
</body>
</html>