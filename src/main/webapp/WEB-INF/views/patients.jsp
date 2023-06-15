<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/06/2023
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tous les patients</title>
</head>
<body>
<h1>
    Tous les produits
</h1>
<c:forEach items="${patients}" var="patient">
    <div>
        <a href="allPatients?id=${patient.getId()}">
            Nom : ${patient.getLastname()}
            Prénom : ${patient.getFirstname()}
        </a>
    </div>
</c:forEach>
</body>
</html>
