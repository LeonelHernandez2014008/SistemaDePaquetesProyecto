<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema De Paquetes</title>
</head>
<body>
	<h1>Listado de Usuarios</h1>
	<a href="ServletListarRolUsuario.do">Nuevo Usuario</a>
	<table>
		<thead>
			<th>NOMBRE</th>
			<th>CONTRASEÑA</th>
			<th>NICK</th>
			<th>CORREO</th>
			<th>NODEIDENTIFICACION</th>
			<th>IDROL</th>
		</thead>
		<tbody>
			<c:forEach items="${listaUsuario}" var="usuario" >
				<tr>
					<td>${usuario.getNombre()}</td>
					<td>${usuario.getContraseña()}</td>
					<td>${usuario.getNick()}</td>
					<td>${usuario.getCorreo()}</td>
					<td>${usuario.getNoDeIdentificacion()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>