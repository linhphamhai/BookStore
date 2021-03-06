<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"
	type="text/css" rel="stylesheet">
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
	<script src="<c:url value="/resources/css/home.css" />"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<c:forEach items="${lstBooks }" var="book">
				<div class="col-md-3">
					<div class="item" style="height: 250px; margin: 10px">
						<img alt="" src="${book.image }" width="100%" height="80%">
						<div>${book.name }</div>
						<div>${book.isbn }</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>