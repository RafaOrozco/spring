<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Iniciar sesion</title>
</head>
<body>
	<c:import url="WEB-INF/cabecera.jsp" />
	<c:choose>
		<c:when test="${sesUsuario !=null }">
			<c:redirect url="error.jsp">
				<c:param name="mensaje" value="Ya estás registrado" />
			</c:redirect>
		</c:when>
		<c:otherwise>
			<form action="autenticar.jsp">
				Usuario: <input name="DNI" /><br /> Clave <input type="password"
					name="clave" /><br /> <input type="submit" value="Conectar" />

			</form>

		</c:otherwise>
	</c:choose>

</body>
</html>