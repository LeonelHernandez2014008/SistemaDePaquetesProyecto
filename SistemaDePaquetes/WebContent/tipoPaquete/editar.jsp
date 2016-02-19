<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="ServletEditarTipoPaquete.do" method="get">
		<input type="hidden" name="txtIdTipoPaquete" value="${tipoPaquete.getIdTipoPaquete()}">
		Tipo de Paquete: <input type="text" name="txtTipoPaquete" value="${libro.getTipoPaquete()}">
		Costo Tipo Paquete: <input type="text" name="txtCostoTipoPaquete" value="${libro.getCostoTipoPaquete()}">
		<input type="submit" value="Agregar">
		</form>
</body>
</html>