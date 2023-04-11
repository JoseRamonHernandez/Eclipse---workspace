<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceCrudProxyid" scope="session" class="org.service.soap.ServiceCrudProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceCrudProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        String id_0id=  request.getParameter("id5");
        int id_0idTemp  = Integer.parseInt(id_0id);
        String name_1id=  request.getParameter("name7");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String updateS_Region2mtemp = sampleServiceCrudProxyid.updateS_Region(id_0idTemp,name_1idTemp);
if(updateS_Region2mtemp == null){
%>
<%=updateS_Region2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateS_Region2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 9:
        gotMethod = true;
        String id_2id=  request.getParameter("id12");
        int id_2idTemp  = Integer.parseInt(id_2id);
        String name_3id=  request.getParameter("name14");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        java.lang.String insertS_Region9mtemp = sampleServiceCrudProxyid.insertS_Region(id_2idTemp,name_3idTemp);
if(insertS_Region9mtemp == null){
%>
<%=insertS_Region9mtemp %>
<%
}else{
        String tempResultreturnp10 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertS_Region9mtemp));
        %>
        <%= tempResultreturnp10 %>
        <%
}
break;
case 16:
        gotMethod = true;
        String id_r_4id=  request.getParameter("id_r19");
        int id_r_4idTemp  = Integer.parseInt(id_r_4id);
        java.lang.String deleteS_Region16mtemp = sampleServiceCrudProxyid.deleteS_Region(id_r_4idTemp);
if(deleteS_Region16mtemp == null){
%>
<%=deleteS_Region16mtemp %>
<%
}else{
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteS_Region16mtemp));
        %>
        <%= tempResultreturnp17 %>
        <%
}
break;
case 21:
        gotMethod = true;
        String id_5id=  request.getParameter("id24");
        int id_5idTemp  = Integer.parseInt(id_5id);
        java.lang.String selectByIdS_Region21mtemp = sampleServiceCrudProxyid.selectByIdS_Region(id_5idTemp);
if(selectByIdS_Region21mtemp == null){
%>
<%=selectByIdS_Region21mtemp %>
<%
}else{
        String tempResultreturnp22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(selectByIdS_Region21mtemp));
        %>
        <%= tempResultreturnp22 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>