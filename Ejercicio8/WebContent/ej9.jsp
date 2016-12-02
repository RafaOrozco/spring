<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=iso-8859-15" %>
<html>
<head>
  <title>JSTL fmt: Fomato de n�meros</title>
</head>
<body>
<h3>N�meros:</h3>  
             
<c:set var="numero" value="120000.2309" />
<p>En moneda: <fmt:formatNumber value="${numero}"  type="currency"/></p>

<p>En moneda (en d�lares, solo esta): <fmt:setLocale value="en_US"/><fmt:formatNumber value="${numero}"  type="currency" /></p> 

<p>En n�mero:<fmt:setLocale value="es_ES"/> <fmt:formatNumber value="${numero}"  type="number"/> </p> 

<p>En n�mero (en ingl�s, solo este):<fmt:setLocale value="en_US"/> <fmt:formatNumber value="${numero}"  type="number"/> </p>
 

<p>En n�mero (solo 3 d�gitos parte entera):<fmt:setLocale value="es_ES"/> <fmt:formatNumber value="${numero}"  type="number" minIntegerDigits="3" maxIntegerDigits="3"/> </p>
 

<p>En n�mero (solo 3 decimales): <fmt:formatNumber value="${numero}"  type="number" minFractionDigits="3" maxFractionDigits="3"/></p> 

<p>En n�mero (sin agrupamiento):<fmt:formatNumber value="${numero}"  type="number" groupingUsed="false"/> </p> 

<p>En porcentaje: <fmt:formatNumber value="${numero}"  type="percent"/></p> 

<p>En porcentaje (m�nimo de 10 decimales): <fmt:formatNumber value="${numero}"  type="percent" minFractionDigits="10"/> </p> 

<p>En numero (patr�n: 5 d�gitos parte entera + 2 parte real + forma exponencial con una cifra): <fmt:formatNumber value="${numero}"  type="number" pattern="#####.##E0"/></p> 

</body>
</html>