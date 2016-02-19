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
		<form action="ServletAgregarPaquete.do" method="get">
			Nombre Paquete: <input type="text" name="txtTipoPaquete">
			Fecha Entrega: <input type="text" name="txtFeEn">
			Fecha Envio: <input type="text" name="txtFeEv">
			Lugar de Entrega: <input type="text" name="txtLuEn">
			Tipo Paquete 	<select name="txtTiPa">
								<option>Seleccione una opcion</option>
								<c:forEach items="${listaTipoPaquete}" var="tp" >
									<option>${tp.getTipoPaquete()}</option>
								</c:forEach>
							</select>
			<input type="submit" value="Agregar">
		</form>
	</body>
</html>