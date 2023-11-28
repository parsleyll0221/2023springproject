<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름으로 리스트 찾기 결과<br>
	<c:forEach var="member" items="${members}">
	아이디 : ${member.id} <br>
	이름 : ${member.name} <br>
	이메일 : ${member.email} <br>
	<hr>
	</c:forEach>
	</body>
</html>