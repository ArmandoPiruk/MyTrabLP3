<%-- 
    Document   : cPanel
    Created on : 06/12/2011, 20:31:53
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
        <title>Painel de Controle</title>
    </head>
    <body>
        <h:form>
        <h:commandLink value="[ Logout ]" action="#{loginMB.logoff}" />
        <h1>Bem vindo <em><h:outputText value="#{loginMB.sesUsuario}" /></em></h1>
        
        <ul>
            <li><h:commandLink value="Clientes" action="cliente" /></li>
            <li><h:commandLink value="Produtos" action="produto" /></li>
            <li><h:commandLink value="Pedidos" action="pedido" /></li>
        </ul>
        </h:form>
    </body>
</html>
</f:view>