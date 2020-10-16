<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter une personne</title>
</head>
<body>
	<h2>Ajouter une personne</h2>

	<s:form name="ajouter" action="ajouterPersonne"
		onsubmit="return validaterFormullaire()">
		<s:textfield name='personne.prenom' label="Prenom" />
		<s:textfield name='personne.nom' label="Nom" />
		<s:textfield name='personne.coordonnee.adresse' label="Adresse" />
		<s:textfield name='personne.coordonnee.courriel' label="Courriel" />
		<s:submit value="Ajouter Personne"></s:submit>
	</s:form>
	
	
<a href='<s:url action="listePersonnes" />'>Appuyez ici pour avoir la liste des personnes</a><br/>
<a href='<s:url action="listeCoordonnees" />'>Appuyez ici pour avoir la liste des coordonnees</a> <br/>

	<script type="text/javascript">
		function validaterFormullaire() {
			let prenom   = document.forms['ajouter']['personne.prenom'].value
			let nom      = document.forms['ajouter']['personne.nom'].value
			let adresse  = document.forms['ajouter']['personne.coordonnee.adresse'].value
			let courriel = document.forms['ajouter']['personne.coordonnee.courriel'].value
			
			let mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/
			
			
			let invalide = prenom == "" || nom == "" || adresse == "" || courriel == "";
			
			if (invalide) {
				alert("Veuillez remplir tous les champs")
				return false
			}
			else if (!courriel.match(mailformat)){
				alert("veillez entrer un courriel valide.")
				
				return false
			}


		}
	</script>
</body>
</html>