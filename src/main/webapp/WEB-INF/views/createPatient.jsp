<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/06/2023
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Créer patient</title>
</head>
<body>
<h1>Ajout d'un nouveau patient</h1>
<div>
    <form action="addpatient" method="post">
        <div><label>Nom</label><input type="text" name="lastname" /></div>
        <div><label>Prénom</label><input type="text" name="firstname" /></div>
        <div><label>Téléphone</label><input type="text" name="phone" /></div>
        <div><button type="submit" >Valider</button></div>
    </form>
</div>
</body>
</html>
