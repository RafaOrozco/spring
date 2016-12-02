<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Albosque</title>
</head>
<body>
<c:import url="WEB-INF/cabecera.jsp" />
<jsp:useBean id="appCatalogo" class="es.cursocoritel.beans.Catalogo" scope="application" />
<table border="1">
<c:forEach var="locProducto" items="${appCatalogo.productos }">
<tr>
<td>
<a href="producto.jsp?locProducto=${locProducto.nombre}">${locProducto.nombre }</a></td>
<td>${locProducto.precio }</td>
<td>${locProducto.stock }</td>

</tr>
</c:forEach>
</table>
</body>
</html>