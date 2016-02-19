<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="../ServletAgregarTipoPaquete.do" method="get">
	
		Tipo de Paquete: <input type="text" name="txtTipoPaquete">
		Costo Tipo Paquete: <input type="text" name="txtCostoTipoPaquete">
		<input type="submit" value="Agregar">
		<input type="submit" value="Cancelar">
</body>
</html>