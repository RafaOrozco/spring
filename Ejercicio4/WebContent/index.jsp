<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
Numero:<input name="numero" type="text" value="<%=request.getAttribute("numero") %>" />
<button>Calcular</button>


<% 
if(request.getAttribute("numero")!=null) {
Integer numero = Integer.parseInt((String) request.getAttribute("numero")); 

if(numero!=null) {  %>

<table>
<tr><td><%=numero %></td></tr>
<% for(int i=0;i<=numero;i++)  {
if(numero%i==0) {
%>
<tr><td><%=i %></td></tr><% } %>
</table>
<% } %>

<% } %>

<% } %>

</form>
</body>
</html>