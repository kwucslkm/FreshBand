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
            <table>
                <tr>
                    <th>모임명</th>
                    <td>${bandGroup.groupName}</td>
                </tr>
                <tr>
                    <th>방장</th>
                    <td>${bandGroup.createMemberNickname}</td>
                </tr>
                <tr>
                    <th>지역</th>
                    <td>${bandGroup.createMemberLocal}</td>
                </tr>
                <tr>
                    <th>관심사</th>
                    <td>${bandGroup.createMemberInterest}</td>
                </tr>
                <tr>
                    <th>모임소개</th>
                    <td>${bandGroup.groupIntro}</td>
                </tr>


            </table>
        </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>
    // const gName = document.getElementById("groupNameId");
    // gName.focus();

</script>
</html>
<%--<c:if test="${boardDetail.fileAttached == 1}">--%>
<%--    <tr>--%>
<%--        <th>첨부파일</th>--%>
<%--        <td>--%>
<%--            <c:forEach items="${boardFileList}" var="boardFile">--%>
<%--                <img src="${pageContext.request.contextPath}/upload/${boardFile.boardStoredFileName}"--%>
<%--                     alt="" width="100" height="100">--%>
<%--            </c:forEach>--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--</c:if>--%>