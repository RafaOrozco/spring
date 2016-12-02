<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="es.cursocoritel.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="libro" class="es.cursocoritel.Libro" scope="application" />
	Hay ${fn:length(${libro.opiniones})} opinion(es)
	<ul>
		<c:forEach var="opinion" items="${libro.opiniones}">
		<c:choose>	
		<c:when test="${opinion.edad>18 }">	
			<li><p style="color: blue">${opinion.nombre }</p></li>
			<li><p style="color: blue">${opinion.edad }</p></li>
			<li><p style="color: blue">${opinion.comentario }</p></li>
			</c:when>
			
			<c:when test="${opinion.edad<=18 }">	
			<li><p style="color: red">${opinion.nombre }</p></li>
			<li><p style="color: red">${opinion.edad }</p></li>
			<li><p style="color: red">${opinion.comentario }</p></li>
			</c:when>
			</c:choose>
		</c:forEach>
	</ul>
</body>
</html>