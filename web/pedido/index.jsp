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
            <h3>Novo Pedido</h3>
            <em>Cliente: </em>
            <h:selectOneMenu id="selectCliente" value="#{pedidoMB.cliente.id}" >
                <f:selectItems value="#{clienteMB.options}" />
            </h:selectOneMenu>
            <h:commandButton value="NovoPedido" action="new" />
            <hr />
            <h3>Pedidos efetuados</h3>
            <h:dataTable value="#{pedidoMB.pedidos}" var="pedido" rendered="#{not pedidoMB.listaVazia}" >
                    <h:column >
                        <f:facet name="header">
                            <h:outputText value="Numero" />
                        </f:facet>
                        <h:outputText value="#{pedido.numero}" />
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Total" />
                        </f:facet>
                        <h:outputText value="#{pedido.total}" />
                    </h:column>
                </h:dataTable>
                <h:outputText  value="Nenhum Pedido Cadastrado" rendered="#{pedidoMB.listaVazia}" />

        </h:form>
    </body>
</html>
</f:view>