<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script>
	$(document).ready(function() {
		$.ajax({
			url : 'http://localhost:8080/BookShop/booktype/api/get-alls',
			type : 'get',
			dataType : 'json',
			success : function(result) {
				var html = '';
				html += '<ul class="nav nav-pills nav-stacked admin-menu"></ul>';
				result.forEach(function(element) {
					html += '<li><a href="#">';
					html += '<span class="glyphicon glyphicon-chevron-right"></span>';
					html += element['name'];
					html += '</a></li>';
				});
				html += '</ul>';
				$('#list-category').html(html);
			}
		});
	});
</script>
<div class="col-md-12" id="list-category"></div>