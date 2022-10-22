<%@page import="modelo.javabeans.Empleado"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Aplicacion de Gesti�n Empleados</h1>
	<p><a href="altaEmpleado.jsp">Nuevo empleado</a></p>
	<%List<Empleado> lista = (List<Empleado>)request.getAttribute("empleados"); %>
	<table border="2">
	<tr>
	<th>Id</th><th>Nombre</th><th>Salario</th><th>Editar</th><th>Eliminar</th>
	</tr>
	<% for (Empleado ele:lista){ %>
	<tr>
	
	<td><%= ele.getIdEmpleado() %></td>
	<td><%= ele.getNombre() %></td>
	<td><%= ele.getSalario() %></td>
	<td><a href="empleados?opcion=editar&id=<%=ele.getIdEmpleado() %>">Editar empleado</a></td>
	<td><a href="empleados?opcion=eliminar&id=<%=ele.getIdEmpleado() %>">Eliminar empleado</a></td>
	</tr>
	
	
	<%} %>
	</table>
</body>
</html>