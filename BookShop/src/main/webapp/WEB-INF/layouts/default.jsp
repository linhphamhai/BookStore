<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title }</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css"
	type="text/css" rel="stylesheet">
<script language="javascript"
	src="http://code.jquery.com/jquery-2.0.0.min.js"></script>
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
<script src="<c:url value="/resources/css/home.css" />"></script>
</head>
<body>
	<div class="container">
		<div class="row menu">
			<tiles:insertAttribute name="menu"></tiles:insertAttribute>
		</div>
		<div class="row">
			<div class="col-md-3" id="categories">
				<tiles:insertAttribute name="categories"></tiles:insertAttribute>
			</div>
			<div class="col-md-9" id="products">
				<div class="body">
					<tiles:insertAttribute name="body"></tiles:insertAttribute>
				</div>
			</div>
		</div>

		<div class="footer">
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</div>
	</div>
</body>
</html>