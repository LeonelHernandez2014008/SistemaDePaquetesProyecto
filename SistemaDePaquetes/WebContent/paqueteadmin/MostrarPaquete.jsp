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
		<form action="ServletModificarPaquete.do" method="post">
			<input type="hidden" name="txtIdPaquete" value="${pac.getIdPaquete()}">
			<input type="hidden" name="txtPaquete" value="${pac.getNombrePaquete()}">
			<input type="hidden" name="txtFecha" value="${pac.getFechaEntrega()}">
			<input type="hidden" name="txtTiPa" value="${pac.getIdTipoPaquete()}">
			Estado
			<select value="${env.getNombre()}" name="txtEnvio">
				<c:forEach items="${estados}" var="tp" >
					<option>${tp.getNombre()}</option>
				</c:forEach>
			</select>
			<input type="submit" value="Actualizar"/>
		</form>
	</body>
</html>