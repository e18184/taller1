<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Ingreso al Sistema</title>
    </head>
    <body>
        <h1>Ingreso al Sistema</h1>
        
        <form:form>
            
            <p>
                <form:label path="usuario">Usuario</form:label>
                <form:password path="usuario" />
            </p>
            
            <p>
                <form:label path="contrasena">Contraseña</form:label>
                <form:password path="contrasena" />
            </p>
            <form:button>Enviar</form:button>   
        </form:form>
        
    </body>
</html>
