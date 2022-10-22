<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>FORMULARIO DE ALTA DE EMPLEADO</h1>
	
	<form action= "empleado?opcion=alta" method="post">
		<p><input type="text" name= "idEmpleado">IdEmpleado</p>
		<p><input type="text" name= "nombre">Nombre</p>
		<p><input type="text" name= "salario">Salario</p>
		
		<p><input type="submit" value= "Enviar"></p>
	</form>

</body>
</html>