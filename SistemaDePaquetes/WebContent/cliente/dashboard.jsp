<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="../include/validarsesion.jsp" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Cliente</h1></center><br/>
BIENVENIDO ${usuario.getNombre()}
	<a href="CerrarSesion.do">Cerrar Sesion</a>
	<a href="ServletListarPaquete.do">Paquetes</a>
</body>
</html>