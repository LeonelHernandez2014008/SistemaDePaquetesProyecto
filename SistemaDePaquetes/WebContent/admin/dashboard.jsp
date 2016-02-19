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
		<center><h1>Administrador</h1></center><br/>
		BIENVENIDO ${usuario.getNombre()}
		<a href="CerrarSesion.do">Cerrar Sesion</a>
		<a href="ServletListarTipoPaquete.do">Tipos de paquetes</a>
		<a href="ServletListarUsuario.do">Operaciones sobre los Usuarios</a>
		<a href="ServletListarPaquetesxUsuario.do">Paquetes por usuario</a>
	</body>
</html>