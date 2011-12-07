<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New/Update Produtos</title>
    </head>
    <body>
        <h1>New/Update Produtos</h1>
        <h:form>
            <h:inputHidden value="#{produtoMB.produto.id}" />
            Nome: <h:inputText value="#{produtoMB.produto.nome}" /><br />
            Descrição: <h:inputText value="#{produtoMB.produto.descricao}" /><br />
            Preço: <h:inputText value="#{produtoMB.produto.preco}" /><br />
            <h:commandButton value="Salvar" action="#{produtoMB.salvar}" />
        </h:form>
    </body>
</html>
</f:view>