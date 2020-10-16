<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
	<h2>Page de confirmation</h2>
	<p>Ajout de la personne suivante :</p>
	Prenom :
	<s:property value="personne.prenom" />
	<br /> 
	Nom : <s:property value="personne.nom" /><br />
	Adresse : <s:property value="personne.coordonnee.adresse" /><br />
	Courriel : <s:property value="personne.coordonnee.courriel" /><br />
	<a href="index.jsp">Retour au menu</a>
</body>
</html>
