<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- IMPORTA ETIQUETAS DE STRUTS -->
<%@ taglib prefix="s" uri="/struts-tags"  %>
<!-- IMPORTA ETIQUETAS DE JAVA SCRIPT -->
<%@ taglib prefix="sx" uri="/struts-dojo-tags"  %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modulo Consulta</title>
</head>
<s:head/>
<sx:head/>
<body>
<nav>
<a href="index.jsp" style="text-decoration: none;"><button type="submit">Regresar a HOME</button></a>
</nav>
<div class="container" style="padding:10%;">

<h3>Listado de UserCaps</h3>
<hr>

	<table>
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>PASSWORD</th>
			<th>GENERO</th>
			<th>IDIOMA</th>
			<th>CIUDAD</th>
			<th>FECHA</th>
			<th>TIPO</th>
			<th>COMENTARIO</th>
		</tr>
		<s:iterator value="usercaps">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="nombre"/></td>
				<td><s:property value="password"/></td>
				<td><s:property value="genero"/></td>
				<td><s:property value="idioma"/></td>
				<td><s:property value="ciudad"/></td>
				<td><s:property value="fecha"/></td>
				<td><s:property value="tipo"/></td>
				<td><s:property value="comentario"/></td>
			</tr>
		</s:iterator>
	</table>
</div>

</body>
</html>