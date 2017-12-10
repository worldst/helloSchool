<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<td>수강년도</td>
	<td>학기</td>
	<td>이수학점</td>
	
	</tr>
	
	<c:forEach var="offer" items="${offers}">
	<tr>
		<p>
			<td> <c:out value="${offer.year}"></c:out></td>
			<td> <c:out value="${offer.semester}"></c:out></td>
			<td> <c:out value="${offer.num}"></c:out></td>
			
		<p>
		
	</c:forEach>
	
	</tr>
	
	</table>
<p> 교과목 리스트 상세보기 ↓↓↓ </p>
<p> <a href="${pageContext.request.contextPath}/detail"> 2012-1 </a> <p>
<p> <a href="${pageContext.request.contextPath}/detail2"> 2012-2 </a> <p>
<p> <a href="${pageContext.request.contextPath}/detail3"> 2015-1 </a> <p>
<p> <a href="${pageContext.request.contextPath}/detail4"> 2015-2 </a> <p>
<p> <a href="${pageContext.request.contextPath}/detail5"> 2016-1 </a> <p>
<p> <a href="${pageContext.request.contextPath}/detail6"> 2016-2 </a> <p>
<p> <a href="${pageContext.request.contextPath}/detail7"> 2017-1 </a> <p>
	
</body>
</html>