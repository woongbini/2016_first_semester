<%@page import="kr.ac.hansung.dao.Course"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>종합정보시스템</h1><hr>
	<p>* 학년/학기별 이수 총 학점을 보여준다.<p>
	<table border="1">
		<tr><td>년도</td><td>학기</td><td>총학점</td><td>상세보기</td></tr>
		<c:forEach var="course1" items="${course1 }">
			<tr>
				<td><c:out value="${course1.year }"></c:out></td>
				<td><c:out value="${course1.semester }"></c:out></td>
				<td><c:out value="${course1.credit }"></c:out></td>
				<td><a href="${pageContext.request.contextPath}/course?year=${course1.year}&semester=${course1.semester }">버튼</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<p>* 이수구분별 학점 내역을 보여준다</p>
	<table border="1">
		<tr>
			<c:forEach var="course" items="${course }">
				<td><c:out value="${course.division }"></c:out></td>
			</c:forEach>	
		</tr>	
		<tr>	
			<c:forEach var="course" items="${course }">
				<td><c:out value="${course.credit }"></c:out></td>
			</c:forEach>
		</tr>	
	</table>
	<!-- 완료 -->
	<p><a href="${pageContext.request.contextPath}/sugang">수강신청</a><p>
	
</body>
</html>
