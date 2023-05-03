<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
    content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Welcome</title>
</head>
<body>
    <h2>${title}</h2>
    <h3>
        <fmt:bundle basename="message">
            <fmt:message key="msg"/>
        </fmt:bundle>
    </h3>
    <p>
        <fmt:formatDate value="${date}" type="date" pattern="dd MMM YYYY" />
    </p>
    <h5>${person.getFullName()}</h5>
    <p>${person.firstName}</p>
</body>
</html>