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
        <%@include file="../component/headerGroupBoard.jsp" %>
        <%@include file="../component/navGroupBoard.jsp" %>
        <div id="section">
            <div id="memberDetailTableSection">
                <table id="memberDetailTable">
<%--                <table id="memberDetailTable" tyle="text-align: center">--%>
                    <tr>
                        <th>회원닉네임</th>
                        <td>${memberDetail.memberNickname}</td>
                    </tr>
                    <tr>
                        <th>가입지역</th>
                        <td>${memberDetail.memberLocal}</td>
                    </tr>
                    <tr>
                        <th>관심사</th>
                        <td>${memberDetail.memberInterest}</td>
                    </tr>
                    <tr>
                        <th>이메일</th>
                        <td>${memberDetail.memberEmail}</td>
                    </tr>
                    <tr>
                        <th>모바일</th>
                        <td>${memberDetail.memberMobile}</td>
                    </tr>
                    <c:if test="${memberDetail.memberProfile == 1}">
                        <tr>
                            <th>첨부파일</th>
                            <td>
                                    <%--                      <c:forEach items="${boardFileList}" var="boardFile">--%>
                                <img src="${pageContext.request.contextPath}/upload/${memberProfile.profileStoredFileName}"
                                     alt="" width="100" height="100">
                                    <%--                      </c:forEach>--%>

                            </td>
                        </tr>
                    </c:if>
<%--                    <tr>--%>
<%--                        <th>프로필</th>--%>
<%--                        <td>${memberDetail.memberProfileFile}</td>--%>
<%--                    </tr>--%>

                </table>
            </div>
            <%--                <div id="groupBoardWrite">--%>
            <%--                    <button id="groupBoardWriteBtn" onclick="board_write()">${bandGroup.groupName}그룹글쓰기</button>--%>
            <%--                </div>--%>
            <%--      <c:if test="${! empty groupBoard}">--%>
            <%--        <div id="GroupBoardList">--%>
            <%--          <c:forEach items="${groupBoard}" var="board">--%>
            <%--            <input type="button" value="${board.bandBoardWriter}">--%>
            <%--            <input type="button" value="${board.createMemberLocal}">--%>
            <%--            <input type="button" value="${board.createMemberInterest}">--%>
            <%--            <input type="button" value="${board.bandBoardContents}">--%>
            <%--            <textarea type="textarea" name="bandBoardContents" cols="30" rows="12">--%>
            <%--                ${board.bandBoardContents}--%>
            <%--            </textarea>--%>
            <%--          </c:forEach>--%>
            <%--        </div>--%>
            <%--      </c:if>--%>
        </div>
    </div>
    <%@include file="../component/footer.jsp" %>
</div>
</body>
<script>
    const board_write = () => {
        const groupname = '${bandGroup.groupName}';
        console.log(groupname);
        location.href = "/bandBoard/save?groupName=" + groupname;

    }
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