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
<title>Modulo - Autentica</title>
</head>
<s:head/>
<sx:head/>
<body>


<nav style="background-color: white;">
	<a href="index.jsp" style="text-decoration:none; background-color: black;"><button type="submit" style="color:white;">HOME</button></a>
</nav>

<hr>
	
<sx:tabbedpanel id="formAutentica">
	<sx:div label="MODULO AUTENTICA CUENTA">
		<s:form action="cuenta.action" method="post">
			<s:textfield key="login" label="LOGIN"/>
			<s:password key ="password" label="PASSWORD"/>
			<s:submit value="ACEPTAR"/>
		</s:form>
	</sx:div>
</sx:tabbedpanel>

</body>
</html>