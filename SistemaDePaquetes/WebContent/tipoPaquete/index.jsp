<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SistemaDePaquetes-TiposDePaquetes</title>
</head>
<body>
	<input type="submit" value="Menu Principal">
	<h1>Listado de Tipos de Paquetes</h1>
	<a href="tipoPaquete/agregar.jsp">Nuevo Tipo de paquete</a>
	<table>
		<thead>
			<th>TIPOPAQUETE</th>
			<th>COSTOTIPOPAQUETE</th>
		</thead>
		<tbody>
			<c:forEach items="${listaTipoPaquete}" var="tipoPaquete" >
				<tr>
					<td>${tipoPaquete.getTipoPaquete()}</td>
					<td>${tipoPaquete.getCostoTipoPaquete()}</td>
					<td><a href="ServletEliminarTipoPaquete.do?idTipoPaquete=${tipoPaquete.getIdTipoPaquete()}">Eliminar</a></td>
					<td><a href="ServletCargarTipoPaquete.do?idTipoPaquete=${tipoPaquete.getIdTipoPaquete()}">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>