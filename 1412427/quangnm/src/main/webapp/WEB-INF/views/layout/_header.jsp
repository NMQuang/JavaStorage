<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<base href="${pageContext.request.contextPath}/">
<meta charset="UTF-8">
<title>Shopping</title>
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/css/custom.css" rel="stylesheet" type="text/css" />
<c:if test="${pageContext.request.requestURI == '/views/category.jsp'}">
	<link rel="stylesheet"
		href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet"
		href="https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css" />
</c:if>
</head>
<body>
	<div class="header">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="/">Home</a></li>
				</ul>
				<c:if test="${!(empty sessionScope['role'])}">
					<form action="/logout" method="post">
						<input type="submit" class="btn btn-danger navbar-btn" value="Logout" /> 
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form>
				</c:if>
			</div>
		</nav>
	</div>