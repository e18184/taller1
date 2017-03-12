<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <ul>
            <li>Nombre : <c:out value="${nombre}" /></li>
            <li>Ap : <c:out value="${ap}" /></li>
            <li>Am : <c:out value="${am}" /></li>
        </ul>
    </body>
</html>