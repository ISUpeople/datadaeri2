<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html>
<head>
	<title>member</title>
</head>
<body>
<h1>
	member!  
</h1>

<form action="/datadaeri2/user/logout" method='post'>
<input type="hidden"name="${_csrf.parameterName}"value="${_csrf.token}" />
<button>Logout</button>
</form>

</body>
</html>
