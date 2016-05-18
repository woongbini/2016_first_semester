<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>sugang shin cheong</title>
	</head>
	<body>
		<h1>종합정보시스템</h1><hr>	
		<p>수강신청하기</p>
		<table border="1">
			<tr><td>과목명</td><td>과목코드</td><td>구분</td><td>학점</td><td>신청하기</td></tr>
			<tr><td>게임프로그래밍</td><td>CSE0049</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/sugang_register" action="get">
						<input type="hidden" value="1" name="id">
						<input type="hidden" value="2016" name="year">
						<input type="hidden" value="2" name="semester">
						<input type="hidden" value="CSE0049" name="course_code">
						<input type="hidden" value="게임프로그래밍" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기">
					</form>
				</td>
			</tr>
			<tr><td>빅데이터분석프로젝트</td><td>CSE0048</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/sugang_register" action="get">
						<input type="hidden" value="1" name="id">
						<input type="hidden" value="2016" name="year">
						<input type="hidden" value="2" name="semester">
						<input type="hidden" value="CSE0048" name="course_code">
						<input type="hidden" value="빅데이터분석프로젝트" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기">
					</form>
				</td>
			</tr>
			<tr><td>취업창업특강</td><td>CSE0046</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/sugang_register" action="get">
						<input type="hidden" value="1" name="id">
						<input type="hidden" value="2016" name="year">
						<input type="hidden" value="2" name="semester">
						<input type="hidden" value="CSE0046" name="course_code">
						<input type="hidden" value="취업창업특강" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기" >
					</form>
				</td>
			</tr>
			<tr><td>인공지능</td><td>CSE0047</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/sugang_register" action="get">
						<input type="hidden" value="1" name="id">
						<input type="hidden" value="2016" name="year">
						<input type="hidden" value="2" name="semester">
						<input type="hidden" value="CSE0047" name="course_code">
						<input type="hidden" value="인공지능" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기" >
					</form>
				</td>
			</tr>
			<tr><td>프로젝트형인턴</td><td>CSE0045</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/sugang_register" action="get">
						<input type="hidden" value="1" name="id">
						<input type="hidden" value="2016" name="year">
						<input type="hidden" value="2" name="semester">
						<input type="hidden" value="CSE0045" name="course_code">
						<input type="hidden" value="프로젝트형인턴" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기" >
					</form>
				</td>
			</tr>
		</table>
		<br><a href="${pageContext.request.contextPath}">돌아가기</a>
	</body>
</html>
