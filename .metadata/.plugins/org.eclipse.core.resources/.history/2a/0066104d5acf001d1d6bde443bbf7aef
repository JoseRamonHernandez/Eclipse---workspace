<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<!-- para importar las librerias -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MODULO ALTA</title>
</head>
<s:head/>
<sx:head/>

<body>

<sx:tabbedpanel id="formCRUD">
        <sx:div label="MODULO CRUD REGISTER">
          <s:form action="alta.action" method="post"> 
			   <s:push value="register">
			     <s:hidden key="id" />
			      	<s:textfield key="name" label="NAME"/>
			      	<s:textfield key="empresa" label="EMPRESA"/>
			      	<s:textfield key="email" label="EMAIL"/>
			      	<s:textfield key="telefono" label="TELEFONO"/>
			      	<s:textfield key="poblacion" label="POBLACION"/>
			        <s:select name="pais" label="PAIS" list="#{'Pue':'PUEBLA','Oax':'OAXACA',
                     'Ver':'VERACRUZ','Tlax':'TLAXCALA'}" headerKey="1" headerValue="Selecciona"/>
                     <s:textfield key="mensaje" label="MENSAJE"/>
			      	<s:submit value="Aceptar"/>
				    <s:reset value="Limpiar"/>
				 </s:push>
          </s:form>
          <table border="1">
			  <tr>
			     <th>ID</th>
			     <th>NAME</th>
			     <th>EMPRESA</th>
			     <th>EMAIL</th>
			     <th>TELEFONO</th>
			     <th>POBLACION</th>
			     <th>PAIS</th>
			     <th>MENSAJE</th>
			  </tr>
		
			  <s:iterator value="listRegisters">
			  <tr>
			     <td><s:property value="id"/></td>
			     <td><s:property value="name"/></td>
			     <td><s:property value="empresa"/></td>
			     <td><s:property value="email"/></td>
			     <td><s:property value="telefono"/></td>
			     <td><s:property value="poblacion"/></td>
			     <td><s:property value="pais"/></td>
			     <td><s:property value="mensaje"/></td>
			  </tr>
			  </s:iterator>
			</table>
        </sx:div>
</sx:tabbedpanel>

</body>
</html>