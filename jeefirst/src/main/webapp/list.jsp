<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
    content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>list</title>
</head>
<body>
    <h2>List</h2>
    <table>
        <tr>
        <th>First Name</th>
        <th>Last Name</th>
        </tr>
        <c:forEach items="${people}" var="p">
            <tr>
                <td>${p.firstName}</td>
                <td>${p.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>