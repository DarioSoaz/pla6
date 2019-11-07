<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta cliente</title>
<style>
.error{color:red;}
</style>
</head>
<body>
<form:form action="procesar" modelAttribute="cliente">
Nombre:<form:input path="nombre"/>
<form:errors path="nombre" cssClass="error"/><br/>
NIF:<form:input path="nif"/><br/>
Provincia<form:select path="provincia">
<form:options items="${ cliente.listaProvincias}"/>
</form:select><br/>
<%--  Sector:<form:radiobuttons path="sector" items="${cliente.listaSectores}"/> --%>
<input type="submit">
</form:form>

</body>
</html>