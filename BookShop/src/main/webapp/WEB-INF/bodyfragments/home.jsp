<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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