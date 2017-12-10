<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="offer">
	
<table>

	<tr> <td> 교과코드 </td> <td> <input type="text" name="code"/> </td> </tr>
	<tr> <td> 교과목명 </td> <td> <input type="text" name="name"/> </td> </tr>
	<tr> <td> 구분 </td> <td> <input type="text" name="etc"/> </td> </tr>
	<tr> <td> 학점 </td> <td> <input type="text" name="num"/> </td> </tr>
	<tr> <td> </td> <td> <input class="control" type="submit" value="수강 신청"/> </td> </tr>
	
</table>

</sf:form>
</body>
</html>