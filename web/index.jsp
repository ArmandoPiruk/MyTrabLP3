<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Trabalho LPIII</title>
        </head>
        <body>
            <h:form>
            <h1><h:outputText value="Login"/></h1>
                login: <h:inputText value="#{loginMB.usuario.login}" /><br />
                password: <h:inputSecret value="#{loginMB.usuario.senha}" /><br />
                <h:commandButton value="Enviar" action="#{loginMB.logar}" />
            </h:form>
        </body>
    </html>
</f:view>
