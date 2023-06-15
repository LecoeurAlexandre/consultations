<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/06/2023
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Détails patient</title>
</head>
<body>
    <h1>
        Détails du patient (${patient.getId()})
    </h1>
    <h2>
        Informations patient
    </h2>
    <div>
        Nom : ${patient.getLastname()}
        Prénom : ${patient.getFirstname()}
        Téléphone : ${patient.getPhone()}
    </div>
    <h2>
        Consultations
    </h2>
    <h3>
        Historique des consultations
    </h3>
    <ul>
        <c:forEach items="${patient.getConsultations()}" var="consultation">
            <a href="createConsultation?consultId=${consultation.getId()}">
                <li> Date : ${consultation.getDate()} </li>
            </a>
        </c:forEach>
    </ul>
    <a href="createConsultation?id=${patient.getId()}">
        Créer une nouvelle consultation
    </a>
</body>
</html>
