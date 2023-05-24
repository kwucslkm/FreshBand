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
            <h2>소모임만들기</h2><br>
            <form action="/bandGroup/save" method="post" id="GroupSaveForm" enctype="multipart/form-data">
                <input type="text" name="createMemberNickname" readonly value="${sessionScope.memberNickName}"> <br>
                <input type="text" name="createMemberLocal" readonly value="${bandMember.memberLocal}"> <br>
                <input type="text" name="createMemberInterest" readonly value="${bandMember.memberInterest}"> <br>
                <input type="text" name="groupName" id="groupNameId" placeholder="소모임이름을 입력하세요"> <br>
                <input type="text" name="groupIntro" placeholder="소모임 소개"> <br>
<%--                <input type="file" name="groupFileAttached" multiple> <br>--%>
                <input type="submit"  value="소모임생성" >
            </form>
        </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>
    const gName = document.getElementById("groupNameId");
    gName.focus();
    // gName.required;

</script>
</html>
