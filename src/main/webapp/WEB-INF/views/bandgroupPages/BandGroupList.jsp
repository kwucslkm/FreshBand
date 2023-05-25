<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-05-19
  Time: 오후 7:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


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
            <h2>bandGroupList</h2>
            <c:choose>
                <%--                <c:when test="${bandGroup.size()==0}">--%>
                <c:when test="${empty bandGroup}">
                    <span>아직 생성 된 모임이 없습니다.</span>
                    <div id="createGroupBtn">
                        <input type="text" id="noGroupYet" value="+" onclick="saveGroup()">

                    </div>
                </c:when>
                <c:otherwise>
                    <c:forEach items="${bandGroup}" var="Group">
                        <input type="button" class="GroupDetail" onclick="group_detail('${Group.groupName}')" value= "${Group.groupName}" >

                    </c:forEach>


                </c:otherwise>

            </c:choose>
        </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>
    const saveGroup = () => {
        location.href = "/bandGroup/save";
    }
    const group_detail = (groupName) => {
        location.href="/bandGroup/Detail?groupName=" + groupName;


    }
</script>
</html>
