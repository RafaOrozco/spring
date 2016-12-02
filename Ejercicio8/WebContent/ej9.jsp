<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=iso-8859-15" %>
<html>
<head>
  <title>JSTL fmt: Fomato de números</title>
</head>
<body>
<h3>Números:</h3>  
             
<c:set var="numero" value="120000.2309" />
<p>En moneda: <fmt:formatNumber value="${numero}"  type="currency"/></p>

<p>En moneda (en dólares, solo esta): <fmt:setLocale value="en_US"/><fmt:formatNumber value="${numero}"  type="currency" /></p> 

<p>En número:<fmt:setLocale value="es_ES"/> <fmt:formatNumber value="${numero}"  type="number"/> </p> 

<p>En número (en inglés, solo este):<fmt:setLocale value="en_US"/> <fmt:formatNumber value="${numero}"  type="number"/> </p>
 

<p>En número (solo 3 dígitos parte entera):<fmt:setLocale value="es_ES"/> <fmt:formatNumber value="${numero}"  type="number" minIntegerDigits="3" maxIntegerDigits="3"/> </p>
 

<p>En número (solo 3 decimales): <fmt:formatNumber value="${numero}"  type="number" minFractionDigits="3" maxFractionDigits="3"/></p> 

<p>En número (sin agrupamiento):<fmt:formatNumber value="${numero}"  type="number" groupingUsed="false"/> </p> 

<p>En porcentaje: <fmt:formatNumber value="${numero}"  type="percent"/></p> 

<p>En porcentaje (mínimo de 10 decimales): <fmt:formatNumber value="${numero}"  type="percent" minFractionDigits="10"/> </p> 

<p>En numero (patrón: 5 dígitos parte entera + 2 parte real + forma exponencial con una cifra): <fmt:formatNumber value="${numero}"  type="number" pattern="#####.##E0"/></p> 

</body>
</html>