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
		<form action="ServletListarPaquetesxUsuario.do" method="post">
			Usuario: <select name="txtUsuarios">
								<option>Seleccione un usuario</option>
								<c:forEach items="${listaUsuario}" var="tp" >
									<option>${tp.getNombre()}</option>
								</c:forEach>
							</select>
			<input type="submit" value="Buscar">
		</form>
		
		<center>
			<table>
				<thead>
					<th>NOMBRE PAQUETE</th>
					<th>FECHA DE ENTREGA</th>
				</thead>
				<tbody>
					<c:forEach items="${listaPaquete}" var="pac" >
						<tr>
							<td>${pac.getNombrePaquete()}</td>
							<td>${pac.getFechaEntrega()}</td>
							<td><a href="ServletCambiarEstado.do?idPaquete=${pac.getIdPaquete()}">Cambiar Estado de Paquete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</center>
	</body>
</html>