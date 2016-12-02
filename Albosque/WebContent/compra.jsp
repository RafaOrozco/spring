<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${sesUsuario==null }">
		<c:redirect url="error.jsp">
			<c:param name="mensaje" value="`No se ha podido realizar la compra" />
		</c:redirect>
	</c:when>
	<c:otherwise>
		<c:set var="locProducto" value="${appCatalogo.getProducto(param.producto) }" />
		<c:when test="${locProducto == null }">
		
		</c:when>
		<c:when test="${param.cantidad == null  || param.cantidad<=0}" >
		</c:when>
		<c:when test="">
		</c:when>
	</c:otherwise>
</c:choose>