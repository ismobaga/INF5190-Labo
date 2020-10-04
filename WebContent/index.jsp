<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>INF5190 Labo 4</title>
</head>
<body>
<a href='<s:url action="bonjour" />'>Bonjour Struts</a></br>
<a href='<s:url action="listePersonnes" />'>Appuyez ici pour avoir la liste des personnes</a></br>
<a href='<s:url action="listeCoordonnees" />'>Appuyez ici pour avoir la liste des coordonnees</a>
</body>
</html>