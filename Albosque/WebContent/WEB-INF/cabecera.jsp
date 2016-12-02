<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div align="right">
	<c:choose>
		<c:when test="${sesUsuario != null}">
	 Hola ${sesUsuario.nombre } (<a href="salir.jsp">Salir</a>) |
	</c:when>
		<c:otherwise>
			<a href="login.jsp">Conectar</a> |
	</c:otherwise>
	</c:choose>
	<a href="carrito.jsp">Carrito</a> (0) | <a href="index.jsp">Home</a>
</div>
<br />