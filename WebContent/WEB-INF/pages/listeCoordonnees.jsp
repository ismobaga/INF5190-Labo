<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>

<!-- Pour l'itération, il faut spécifier le type de données -->
<jsp:useBean id="listeCoordonnees" type="java.util.ArrayList<com.uqam.inf5190.labo2.bean.CoordonneeBean>" scope="request" />

<html>
    <head>
        <meta charset="utf-8" />
        <title>Liste des coordonnees</title>
    </head>
    <body>
        
        <% for(int i = 0; i < listeCoordonnees.size(); i+=1) { %>
            <div><%=listeCoordonnees.get(i).getAdresse()%> <%=listeCoordonnees.get(i).getCourriel()%></div>
            <br />
        <% } %>
        
        
    </body>
</html>