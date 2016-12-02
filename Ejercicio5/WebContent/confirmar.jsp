<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="es.cursocoritel.*" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmar opinion</title>
</head>
<body>
<jsp:useBean id="opinion" class="es.cursocoritel.Opinion" scope="session" />
<jsp:setProperty  name="opinion" property="*"/>


<p>Tus datos son:</p>
<ul>
<li> Nombre : ${fn:toUpperCase(${param.nombre})} </li>
<li>Edad: ${param.edad}</li>
<li>Comnetario: ${param.comentario} </li>
</ul>
<a href="index.html">Volver</a>
<a href="anadir.jsp">Añadir</a>

</body>
</html>