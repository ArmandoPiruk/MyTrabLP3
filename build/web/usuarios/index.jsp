<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários</title>
    </head>
    <body>
        <h1>Listando usuários!</h1>
        <h:form>
            <h:dataTable var="usuario" value="#{usuarioMB.usuarios}" >
                <h:column>
                    <f:facet name="header">ID: </f:facet>
                    <h:outputText value="#{usuario.id}" />
                </h:column>
                <h:column>
                    <f:facet name="header">Login: </f:facet>
                    <h:outputText value="#{usuario.login}" />
                </h:column>
                <h:column>
                    <h:commandButton value="Destroy" action="#{usuarioMB.destroy}" >
                        <f:setPropertyActionListener value="#{usuario}" target="#{usuarioMB.cliente}"/>
                    </h:commandButton>
                </h:column>
            </h:dataTable>
        
        <h:commandLink value="Novo Cliente" action="new" />
        </h:form>
    </body>
</html>
</f:view>