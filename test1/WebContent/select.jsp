<%@page import="java.util.ArrayList"%>
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
<title>찾아보기</title>
</head>
<body>
	<%
	String sql="SELECT * FROM users WHERE id=1";
	Connection conn=DBConn.getConnection();
	PreparedStatement pstmt=
			conn.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	
	ArrayList<Object> list=new ArrayList();
	int id=0;
	String username="";
	String password="";
	String email="";
	while(rs.next()==false){
		id=rs.getInt("id");
		 username=rs.getString("username");
		 list.add(username);
		 password=rs.getString("password");
		 list.add(password);
		 email=rs.getString("email");
		 list.add(email);
	}
%>

		<h3>id:<%=id %></h3>
		<h3>username:<%=username %></h3>
		<h3>password:<%=password %></h3>
		<h3>email:<%=email %></h3>
</body>
</html>