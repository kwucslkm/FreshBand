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
    <%@include file="../component/header.jsp" %>
    <%@include file="../component/nav.jsp" %>
    <div id="section">
        <h2>로그인</h2>
        <form action="/bandMember/Login"  id="memberLoginForm" method="post" >
            <input type="text" name="memberEmail" class="memberLoginInput" placeholder="이메일을 입력하세요"  id="member-email">
            <p id="check-result"></p>
            <input type="text" name="memberPassword" class="memberLoginInput" placeholder="비밀번호를 입력하세요"> <br>
            <h6 id="loginchk"></h6>
            <input type="submit" class="memberLoginInput" value="로그인" onclick="loginchk()">
        </form>
    </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>

</script>
</html>
