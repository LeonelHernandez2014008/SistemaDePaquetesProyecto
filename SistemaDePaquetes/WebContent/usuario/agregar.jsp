<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletAgregarUsuario.do" method="get">
	
		Nombre: <input type="text" name="txtNombre">
		Contrase�a: <input type="text" name="txtContrase�a">
		Nick: <input type="text" name="txtNick">
		Correo: <input type="text" name="txtCorreo">
		No.de Identificacion: <input type="text" name="txtNoDeIdentificacion">
		Rol:<select name="txtRol">
								<option>Seleccione una opcion</option>
								<c:forEach items="${listaRol}" var="tp" >
									<option>${tp.getNombre()}</option>
								</c:forEach>
							</select>
		<input type="submit" value="Agregar">
</body>
</html>