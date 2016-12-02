<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
  <title>JSTL fmt: Fechas</title>
</head>
<body>
<h3>Fechas y horas:</h3>
<c:set var="now" value="<%=new java.util.Date()%>" />

<p>Hora Actual: <fmt:formatDate type="time" value="${now}" /></p>

<p>Fecha Actual: <fmt:formatDate type="date" value="${now}" /></p>

<p>Fecha y Hora Actual: <fmt:formatDate type="both" value="${now}" /> </p>

<p>Fecha y Hora Actual en inglés (solo esta):<fmt:setLocale value="en_US" /> <fmt:formatDate type="both" value="${now}" /></p><fmt:setLocale value="es_ES" />

<p>Fecha y Hora Actual (formato corto): <fmt:formatDate type="both" value="${now}" dateStyle="short" timeStyle="short"/></p>

<p>Fecha y Hora Actual (formato medio): <fmt:formatDate type="both" value="${now}" dateStyle="medium" timeStyle="medium"/></p>

<p>Fecha y Hora Actual (formato largo): <fmt:formatDate type="both" value="${now}" dateStyle="long" timeStyle="long"/></p>

<p>Fecha y Hora Actual (patrón: 20:03 24-11-2016):<fmt:formatDate type="time" value="${now}" pattern="HH:mm"/> <fmt:formatDate type="date" value="${now}" pattern="dd-MM-yyyy"/> </p>

</body>
</html>
