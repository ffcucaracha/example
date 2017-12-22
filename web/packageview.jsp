<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" import="java.util.*, package1.*" %>
<jsp:useBean id="pList" class="package1.PackageList1" scope="application"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example</title>
    </head>
    <body>
        <h1>Информация про </h1>
        <% 
            Integer id = 1;
            try{
                id = Integer.parseInt(request.getParameter("id"));
            } catch(Exception e) {}
            Package1 p = pList.getPackage1(id); %>
            <h2><%=p.getName()%></h2>
    </body>
</html>
