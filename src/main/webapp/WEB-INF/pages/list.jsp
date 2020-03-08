<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>name</td>
            <td>email</td>
            <td>gender</td>
        </tr>
        <c:forEach items="${addEmpls}" var="empl">
            <tr>
                <td>${empl.lastName}</td>
                <td>${empl.email}</td>
                <td>${empl.gender}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
