<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Alumno</title>
<style type="text/css">
.error{color:red;}
</style>
</head>
<body>
	<h1>Registrar Alumno</h1>
	<br/>
	<form:form action="procesarAlumno" modelAttribute="alumno">

		Nombre:<form:input  path="nombre" />
		<form:errors path="nombre" class="error" /><br/>
		DNI:<form:input  path="dni" />
		<form:errors path="dni" class="error" /><br/>
		Email:<form:input path="email" />
		<form:errors path="email" class="error" /><br/>
		Becado:<form:radiobuttons path="becado"
			items="${alumno.listaBecado}" /><br/>
		Asignatura:<form:checkboxes items="${alumno.listaAsignaturas}"
			path="asignaturas"  />
		<form:errors path="asignaturas" class="error" /><br/>

		<input type="submit" value="Registrar">
	</form:form>

</body>
</html>