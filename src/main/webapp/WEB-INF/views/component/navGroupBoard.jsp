<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="nav">
    <ul>
        <li id="navRegGroup" style="font-size: 12px; font-weight: bold">
            <%--            <a href="/save_member">이밴드가입</a>--%>
        </li>
        <li id="navMenulogin" style="font-size: 12px; font-weight: bold">
            <%--            <a href="/memberLogin">로그인</a>--%>
        </li>
        <li id="navMenuPaging">
            <%--            <a href="/pagingList">소모임</a>--%>
        </li>
        <li id="navMenus1" style="font-size: 12px; font-weight: bold">
        </li>
        <c:if test="${memberRegGroup != 0}">
            <li id="write-GroupBoard" style="float: right; font-size: 12px; color: red; font-weight:bold;">
                <a href="/bandBoard/save?groupName=${bandGroup.groupName}">글쓰기</a>
            </li>
        </c:if>
    </ul>
</div>

<script>
    // const loginArea = document.getElementById("login-area");
    const groupNavMenu1 = document.getElementById("navRegGroup");
    const writeBnt = document.getElementById("write-GroupBoard");
    const groupName = '${bandGroup.groupName}';
    <%--console.log("그룹가입했나=" +${memberRegGroup != 0});--%>
    if (${memberRegGroup == 0}) {
        <%--if ('${sessionScope.memberNickName}' != '${bandGroup.createMemberNickname}') {--%>
        groupNavMenu1.innerHTML = "<a href='/bandGroup/memberRegGroup?groupName=" + groupName + "\' style='color: yellow;'>그룹가입하기</a>"
        // }
    } else {
        groupNavMenu1.innerHTML = "<a href='/bandBoard/save?groupName=" + groupName + "\' style='color: yellow;'>글쓰기</a>"
    }
</script>