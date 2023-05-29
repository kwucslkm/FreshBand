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
            <h2>회원가입</h2><br>
            <form action="/bandMember/save" method="post" id="memberSaveForm" enctype="multipart/form-data">
                <input type="text" name="memberEmail" placeholder="이메일" class="memberSaveInput" id="member-email"
                       onblur="emailchk()">
                <h6 id="check-result"></h6><br>
                <input type="text" name="memberPassword" class="memberSaveInput" id="password" onblur="password_chk()"
                       placeholder="비밀번호">
                <h6 id="pwCheck-result"></h6><br>
                <input type="text" name="memberNickname" class="memberSaveInput" placeholder="닉네임"> <br>
                <input type="text" name="memberLocal" class="memberSaveInput" placeholder="지역"> <br>
                <input type="text" name="memberInterest" class="memberSaveInput" placeholder="관심사"> <br>
                <input type="text" name="memberMobile" class="memberSaveInput" id="memberPhone"
                       onblur="memberPhone_chk()" placeholder="전화번호">
                <h6 id="phone-result"></h6>
                <input type="file" name="memberProfileFile" class="memberSaveInput" > <br>
<%--                <input type="file" name="memberProfileFile" class="memberSaveInput" multiple> <br>--%>
                <input type="submit" class="memberSaveInput" value="회원가입" onclick="memberSaveResult()">

            </form>
        </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>

</script>
</html>
