<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	메뉴 <br>
	<a href="/insert">데이터 추가</a> <br><p>
	<a href="/selectAll">전체 조회</a> <br><p>
	<a href="/selectById?id=1">개별 조회</a> <br><p>
	<a href="/selectByName?name=장길동">개별 조회 - byName</a> <br><p>
	<a href="/selectByEmail?email=abc2@abc.com">개별 조회 - byEmail</a> <br><p>
	<a href="/selectByNameLike?name=길동">리스트 조회 - NameLike</a> <br><p>
	
</body>
</html>