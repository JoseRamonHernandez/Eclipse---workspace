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
        <sx:div label="MODULO CRUD REPORT">
          <s:form action="alta.action" method="post"> 
			   <s:push value="report">
			     <s:hidden key="id" />
			     
			      	<s:textfield key="tipo" label="TIPO"/>
			      	<s:textfield key="folio" label="FOLIO"/>
			      	<s:textfield key="comentario" label="COMENTARIO"/>
			      	
				    <s:submit value="Aceptar"/>
				    <s:reset value="Limpiar"/>
				 </s:push>
          </s:form>
          <table border="1">
			  <tr>
			     <th>ID</th>
			     <th>TIPO</th>
			     <th>FOLIO</th>
			     <th>COMENTARIO</th>
			  </tr>
		
			  <s:iterator value="listReport">
			  <tr>
			     <td><s:property value="id"/></td>
			     <td><s:property value="tipo"/></td>
			     <td><s:property value="folio"/></td>
			     <td><s:property value="comentario"/></td>
			     <td>
			         <s:url id="editURL" action="edita">
			             <s:param name="id" value="%{id}"/>
			         </s:url>
			         <s:a href="%{editURL}">Editar</s:a>
			     </td>
			      <td>
			         <s:url id="deleteURL" action="baja">
			             <s:param name="id" value="%{id}"/>
			         </s:url>
			         <s:a href="%{deleteURL}">Eliminar</s:a>
			     </td>	  
			  </tr>
			  </s:iterator>
			</table>
        </sx:div>
</sx:tabbedpanel>

</body>
</html>