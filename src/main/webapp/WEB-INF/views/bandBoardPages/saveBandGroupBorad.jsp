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
            <h2>그룹게시판 글쓰기</h2><br>
            <form action="/bandBoard/save" method="post" id="GroupBoardSaveForm" enctype="multipart/form-data">
                <input type="text" style="display: none" name="bandBoardWriter" readonly value="${sessionScope.memberNickName}"> <br>
                <input type="text" style="display: none" name="memberId" readonly value="${member.id}"> <br>
                <input type="text" style="display: none" name="groupId" readonly value="${group.id}"> <br>
                <textarea type="textarea" name="bandBoardContents" cols="50" rows="27" placeholder="여기에 소식을 전해보세요" ></textarea> <br>
                <input type="file" name="memberProfileFile" class="memberSaveInput" multiple> <br>
                <input type="submit" class="memberSaveInput" value="글저장" onclick="memberSaveResult()">

            </form>
        </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>

</script>
</html>
