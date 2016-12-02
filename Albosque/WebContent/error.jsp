<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página de errores</title>
</head>
<body>
	<c:import url="WEB-INF/cabecera.jsp" />
	<c:choose>
		<c:when test="${param.mensaje !=null }">
			<p>Lo sentimos, pero no hemos podido atender su peticion</p>
		${param.mensaje }
		 </c:when>
		<c:otherwise>
		<c:redirect url="index.jsp" />
		</c:otherwise>
	</c:choose>
</body>
</html>