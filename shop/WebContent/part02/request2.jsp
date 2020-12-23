<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String protocol = request.getProtocol();							//사용 중인 프로토콜을 반환
	String serverName = request.getServerName();			// 서버의 도메인 이름을 반환
	int serverPort = request.getServerPort();						//서버의 주소를 반환
	String remoteAddr = request.getRemoteAddr();			// 클라이언트의 주소를 반환
	String remoteHost = request.getRemoteHost();				// 클라이언트의 호스트 이름을 반환
	String method = request.getMethod();								// 요청에 사용된 요청 방식(GET, POST, PUT)을 반환
	StringBuffer requestURL = request.getRequestURL();// 요청에 사용딘 URL 반환
	String requestURI = request.getRequestURI();				// 요청에 사용된 URL로부터 URI 반환
	String useBrowser = request.getHeader("User-Agent");//HTTP 요청 헤더에 지정된 name의 값을 반환
	String fileType = request.getHeader("Accept");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Request Example2</h1>
프로토콜 : <%=protocol %><p/>
서버의 이름 : <%=serverName %><p/>
서버의 포트 번호 : <%=serverPort %><p/>
사용자의 컴퓨터 주소 : <%=remoteAddr %><p/>
사용자의 컴퓨터 이름 : <%=remoteHost %><p/>
사용 method : <%=method %><p/>
요청 경로(URL) : <%=requestURL %><p/>
요청 경로(URI) : <%=requestURI %><p/>
현재 사용하는 브라우저 : <%=useBrowser %><p/>
브라우저가 지원하는 file의 type : <%=fileType %><p/>
</body>
</html>