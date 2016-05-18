<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>course</title>
	</head>
	<body>
		<h1>종합정보시스템</h1><hr>
		<p>상세보기 : <%= request.getParameter("year") %>년도 <%=request.getParameter("semester") %>학기</p>
		<table border="1">
			<tr><td>년도</td><td>학기</td><td>교과코드</td><td>교과명</td><td>구분</td><td>학점</td></tr>
			<c:forEach var="course3" items="${course3 }">
				<tr>
					<td><c:out value="${course3.year }"></c:out></td>
					<td><c:out value="${course3.semester }"></c:out></td>
					<td><c:out value="${course3.course_code }"></c:out></td>
					<td><c:out value="${course3.course_name }"></c:out></td>
					<td><c:out value="${course3.division }"></c:out></td>
					<td><c:out value="${course3.credit}"></c:out></td>
				</tr>
			</c:forEach>	
		</table>
		<br><a href="/${pageContext.request.contextPath}">돌아가기</a>
	</body>
</html>