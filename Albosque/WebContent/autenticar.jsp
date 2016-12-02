<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${sesUsuario !=null }">
		<c:redirect url="error.jsp">
			<c:param name="mensaje" value="Ya estás registrado" />
		</c:redirect>
	</c:when>
	<c:otherwise>
		<jsp:useBean id="appUsuarios" class="es.cursocoritel.beans.Usuarios"
			scope="application" />
		<jsp:useBean id="locUsuario" class="es.cursocoritel.beans.Usuario" />
		<jsp:setProperty name="locUsuario" property="*" />
		<c:set var="sesUsuario" value="${ appUsuarios.getUsuario(locUsuario)}"
			scope="session" />
		<c:if test="${sesUsuario == null }" var="condicion">
			<c:redirect url="error.jsp">
				<c:param name="mensaje"
					value="Los datos introducidos no son correctos" />
			</c:redirect>
		</c:if>
		<c:if test="${!condicion }">
			<c:redirect url="index.jsp" />
		</c:if>
	</c:otherwise>
</c:choose>