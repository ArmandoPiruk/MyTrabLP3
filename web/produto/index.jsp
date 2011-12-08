<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos</title>
    </head>
    <body>
        <h:form>
            <h:commandLink value="[ Logout ]" action="#{loginMB.logoff}" />
            <h1>Todos os produtos!</h1>
            <h:dataTable var="produto" value="#{produtoMB.produtos}" >
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="ID" />
                    </f:facet>
                    <h:outputText value="#{produto.id}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Nome" />
                    </f:facet>
                    <h:outputText value="#{produto.nome}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Preco" />
                    </f:facet>
                    <h:outputText value="#{produto.preco}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Descricao" />
                    </f:facet>
                    <h:outputText value="#{produto.descricao}" />
                </h:column>
                <h:column>
                    <h:commandButton value="Editar" action="new" >
                        <f:setPropertyActionListener value="#{produto}" target="#{produtoMB.produto}"/>
                    </h:commandButton>
                </h:column>
                <h:column>
                    <h:commandButton value="Destroy" action="#{produtoMB.destroy}" >
                        <f:setPropertyActionListener value="#{produto}" target="#{produtoMB.produto}"/>
                    </h:commandButton>
                </h:column>
            </h:dataTable>
        
        <h:commandLink value="Novo Produto" action="new" />
        </h:form>
    </body>
</html>
</f:view>