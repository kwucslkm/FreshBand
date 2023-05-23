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
<div id="bandBody">
    <div id="hns">
        <%@include file="component/header.jsp" %>
        <%@include file="component/nav.jsp" %>
        <div id="mainMent">
            <h5>
                프레쉬밴드는 그룹 멤버와 함께 소통 하는 공간입니다.
                동호회, 스터디, 지역별, 주제별 모임을 프레쉬밴드로 시작하세요
            </h5>
        </div>
        <div id="mainlogo">
            <h1>FRESHBAND</h1></div>
        <div id="indexBtn">
            <button class="index_btn" ID="mainLogin" onclick="bandLogin()">로그인</button>
            <button class="index_btn" ID="member_save" onclick="memberSave()">회원가입</button>
        </div>
    </div>

    <%@include file="component/footer.jsp" %>
</div>
</body>
<script>
    const memberSave = () => {
        location.href = "/bandMember/save";
    }
    const bandLogin = () => {
        location.href = "/bandMember/Login";

    }
</script>
</html>
