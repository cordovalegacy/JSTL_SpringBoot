<%--
  Created by IntelliJ IDEA.
  User: cordo
  Date: 10/19/2023
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>General Hopper</title>
<%--    <link rel="stylesheet" type="text/css" href="@{/css/style.builds.tailwind.css}">--%>
    <link rel="stylesheet" type="text/css" href="/css/app.css">
<%--    <script type="text/javascript" src="/js/app.js" defer></script>--%>
</head>
<body>
<div class="flex-box bg-blue text-amber">
    <p class="word text-amber-600 font-bold">Customer Name: <c:out value="${name}"/></p>
    <p>Item Name: <c:out value="${itemName}"/></p>
    <p>Price: <c:out value="${price}"/></p>
    <p>Description: <c:out value="${description}"/></p>
    <p>Vendor: <c:out value="${vendor}"/></p>
</div>
</body>
</html>
