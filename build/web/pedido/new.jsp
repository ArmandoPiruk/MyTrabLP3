<%-- 
    Document   : newjsp
    Created on : 08/12/2011, 20:15:16
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
        <title>Novo:Pedido</title>
    </head>
    <body>
        <h:form>
            <h3>Pedido para cliente: <em><h:outputText value="#{pedidoMB.sesClienteId}" /></em></h3>
            <p>to be continue (rs)</p>
        </h:form>
    </body>
</html>
</f:view>