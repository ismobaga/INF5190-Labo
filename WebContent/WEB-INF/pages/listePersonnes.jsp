<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>

<!-- Pour l'itération, il faut spécifier le type de données -->
<jsp:useBean id="listePersonnes" type="java.util.ArrayList<com.uqam.inf5190.labo2.bean.PersonneBean>" scope="request" />

<html>
    <head>
        <meta charset="utf-8" />
        <title>Liste des personnes</title>
    </head>
    <body>
        
        <% for(int i = 0; i < listePersonnes.size(); i+=1) { %>
            <div><%=listePersonnes.get(i).getPrenom()%> <%=listePersonnes.get(i).getNom()%></div>
            <br />
        <% } %>
        
    </body>
</html>