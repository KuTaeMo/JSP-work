<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.cos.test1.config.DBConn"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력하기</title>
</head>
<body>
	<%
	String sql="INSERT INTO users(username, password,email) VALUES('java','1234','java@nate.com')";
	Connection conn=DBConn.getConnection();
	PreparedStatement pstmt=
			conn.prepareStatement(sql);
	int result=pstmt.executeUpdate();
	%>
	<h3><%=result %></h3>
</body>
</html>