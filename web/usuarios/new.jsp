<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>New/Update Usuarios</h1>
        <h:form>
            <h:inputHidden value="#{usuarioMB.usuario.id}" />
            Login: <h:inputText value="#{usuarioMB.usuario.login}" /><br />
            Senha: <h:inputSecret value="#{usuarioMB.usuario.senha}" /><br />
            <h:commandButton value="Salvar" action="#{usuarioMB.salvar}" />
        </h:form>
    </body>
</html>
</f:view>