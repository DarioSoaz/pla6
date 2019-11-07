<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registrado</title>
</head>
<body>
	<h1>El registro del alumno se ha realizado correctamente</h1>
	<h2>Los datos introducidos son:</h2>
		<p>Nombre: ${alumno.nombre}</p>
		<p>DNI:${alumno.dni}</p>
		<p>Email:${alumno.email}</p>
		<p>Becado:${alumno.becado}</p>
		<p>Asignaturas:</p>
		<ul>
			<c:forEach var="asignatura" items="${alumno.asignaturas}">
				<li>${asignatura}</li>
			</c:forEach>
		</ul>
</body>
</html>