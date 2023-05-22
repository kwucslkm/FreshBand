<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-05-19
  Time: 오후 7:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>index</title>
    <link rel="stylesheet" href="/resources/css/main.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>

<body>
<%@include file="component/header.jsp" %>
<%@include file="component/nav.jsp"%>

밴드는 그룹 멤버와 함께 한느 공간입니다. 동호회, 스터디 주제별 모임을 밴드로 시작하세요
<button  ID="mainLogo" onclick="bandLogin()">로그인</button>
<button value="freshBand" ID="mainLogo"></button>




<%@include file="component/footer.jsp"%>
</body>
<script>
    const bandLogin = () => {
        location.href= "bandLogin"

    }
</script>
</html>
