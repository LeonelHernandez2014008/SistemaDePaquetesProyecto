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
		<center><h1>Mis Paquetes</h1></center>
		<a href="ServletListarTiPaAgregarPaquete.do">Nuevo paquete</a>
		<table>
			<thead>
				<th>NOMBRE PAQUETE</th>
				<th>FECHA DE ENTREGA</th>
			</thead>
			<tbody>
				<c:forEach items="${listaPaquetes}" var="pac" >
					<tr>
						<td>${pac.getNombrePaquete()}</td>
						<td>${pac.getFechaEntrega()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>