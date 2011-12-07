<%-- 
    Document   : new
    Created on : 06/12/2011, 22:24:43
    Author     : Armando
--%>
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
        <h1>New/Update Cliente</h1>
        <h:form>
            <h:inputHidden value="#{clienteMB.cliente.id}" />
            Nome: <h:inputText value="#{clienteMB.cliente.nome}" /><br />
            Email: <h:inputText value="#{clienteMB.cliente.email}" /><br />
            <h:commandButton value="Salvar" action="#{clienteMB.salvar}" />
        </h:form>
    </body>
</html>
</f:view>