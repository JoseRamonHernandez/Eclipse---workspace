<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>

<div class="container" style="padding: 5%; aling-context: center;">
<hr>
	<h1>STRUTS: CATALOGO, AUTENTICACION, VALIDACION</h1>
<hr>
<br>
	<form action="catalogo.action" method="post">
		<input type="submit" value="FROM CATALOGO - CIUDAD" style="cursor: pointer; border:10px;">
	</form>


<div style="background-color:black; color: white;">
<p>Next();</p>
</div>

<br>

	<form action="formautentica.jsp" method="post">
		<input type="submit" value="FROM AUTENTICA - CUENTA" style="cursor: pointer; border:10px;">
	</form>


<div style="background-color:black; color: white;">
<p>Next();</p>
</div>

<br>

	<form action="formvalida.jsp" method="post">
		<input type="submit" value="FROM VALIDA - HTA" style="cursor: pointer; border:10px;">
	</form>

</div>
</body>
</html>