<%-- 
    Document   : index
    Created on : 08/12/2011, 19:43:39
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
        <title>Pedidos</title>
    </head>
    <body>
        <h:form>
            <h1>Pedidos</h1>
            <em>Cliente: </em>
            <h:selectOneMenu id="selectCar" value="#{pedidoMB.cliente}">
                <f:selectItems value="#{clienteMB.clientes}" />
            </h:selectOneMenu>
            <h:commandButton value="Novo Pedido" action="new" />
        </h:form>
    </body>
</html>
</f:view>