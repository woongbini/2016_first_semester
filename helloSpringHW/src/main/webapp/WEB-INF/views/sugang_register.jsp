<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>sugang_register</title>
	</head>
	<body>
		<p><%= request.getParameter("year") %>년도 <%=request.getParameter("semester") %>학기</p>
		<p><%=request.getParameter("divison") %>, <%= request.getParameter("credit")%>학점,
		<%= request.getParameter("course_name")%> 수강신청 완료!</p>
		<br><a href="${pageContext.request.contextPath}">돌아가기</a>
	</body>
</html>