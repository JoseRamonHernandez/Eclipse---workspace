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
<title>MODULO - Catalogo</title>
</head>
<s:head/>
<sx:head/>
<body>


<nav style="background-color: white;">
	<a href="index.jsp" style="text-decoration:none; background-color: black;"><button type="submit" style="color:white;">HOME</button></a>
</nav>

<hr>
	
<sx:tabbedpanel id="formCatalogo">
        <sx:div label="MODULO CATALOGO CIUDAD">
      
             <s:radio name="ciudad" label="CIUDAD" list="nombresCiudades"/>
             <br>
             <s:checkboxlist name="ciudad" label="CIUDAD" list="nombresCiudades"/>
              <br>      
             <s:select name="ciudad" label="CIUDAD" list="nombresCiudades" headerKey="1" headerValue="Selecciona"/> 
              <br>
             <sx:autocompleter name="ciudad" label="CIUDAD" list="nombresCiudades"/>

        </sx:div>
</sx:tabbedpanel>

	
	
</body>
</html>