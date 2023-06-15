<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/06/2023
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Détails consultation</title>
</head>
<body>
<h1>
    Détails de la consultation (${consultation.getId()})
</h1>
<h2>
    Informations générales de la consultation
</h2>
<div>
    Date : ${consultation.getDate()}
</div>
<h2>
    Fiche de soin
</h2>
<a href="treatment?id=${consultation.getId()}">
    Créer une nouvelle fiche de soin
</a>
<h2>
    Prescription
</h2>
</body>
</html>
