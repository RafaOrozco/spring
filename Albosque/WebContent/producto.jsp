<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Producto</title>
</head>
<body>
	<c:import url="WEB-INF/cabecera.jsp" />

<c:choose>
	<c:when test="${param.locProducto == null }">
		<c:redirect url="error.jsp">
			<c:param name="mensaje" value="No ha indicado el prodcuto" />
		</c:redirect>
	</c:when>
	<c:otherwise>
		<jsp:useBean id="appCatalogo" class="es.cursocoritel.beans.Catalogo"  scope="application"/>
		<c:set var="locProducto" value="${appCatalogo.getProducto(param.locProducto) }" />
		<c:choose>
			<c:when test="${locProducto != null }">
				<h1>${locProducto.nombre }</h1>
				<br />
				<p>Precio: ${locProducto.precio }</p>
				<p>Descripcion: ${locProducto.precio }</p>
				<p>Stock: ${locProducto.stock }</p>
				<form action="compra.jsp">
				Unidades: <input name="cantidad" /> <br />
				<input type="hidden" name="producto" value="${locProducto.nombre }" /><br />
				<input type="submit" value="Comprar" />
				</form>
			</c:when>
			<c:otherwise>

				<c:redirect url="error.jsp">
					<c:param name="mensaje" value="El producto no existe" />
				</c:redirect>
				
			</c:otherwise>
		</c:choose>

	</c:otherwise>


</c:choose>

</body>
</html>