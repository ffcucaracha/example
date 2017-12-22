<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true" import="java.util.*, package1.*" %>
<jsp:useBean id="pList" class="package1.PackageList1" scope="application"/>
<jsp:useBean id="tList" class="type.TypeList" scope="application"/>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список</title>
    </head>
    <body>
        <h1 align="center">Список</h1>
        <table border="1" align="center">
            <thead><td>Номер</td><td>Имя</td><td>Тип</td><td>Дата</td><td></td></thead>
            <% for(Package1 package1 : pList.values()){
            %>
            <tr><td><%=package1.getId()%></td><td><%=package1.getName()%></td>
                <td><%=package1.getType(tList)%></td><td><%=package1.getDate()%></td>
                <td><form action="packageview.jsp"><input name="id" value="<%=package1.getId() %>" type="hidden"/><input type="submit" value="Просмотреть"/></form></td></tr>
            <%}%>
        </table>
    </body>
</html>
