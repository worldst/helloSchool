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
	<td>교과코드</td>
	<td>교과목명</td>
	<td>구분</td>
	<td>학점</td>
	
	</tr>
	
	<c:forEach var="detail" items="${detail}">
	<tr>
		<p>
			<td> <c:out value="${detail.code}"></c:out></td>
			<td> <c:out value="${detail.name}"></c:out></td>
			<td> <c:out value="${detail.etc}"></c:out></td>
			<td> <c:out value="${detail.num}"></c:out></td>
			
		<p>
		
	</c:forEach>
	
	</tr>
	
	</table>
</body>
</html>