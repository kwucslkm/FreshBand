<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="header">
    <ul>
        <li>
            <a href="/">
                <i class="bi bi-house"></i>
            </a>
        </li>
<%--        <li id="headerMenuSave"style="font-size: 12px; font-weight: bold">--%>
<%--            &lt;%&ndash;            <a href="/save_member">회원가입</a>&ndash;%&gt;--%>
<%--        </li>--%>
        <li id="headerMenulogin">
            <%--            <a href="/memberLogin">로그인</a>--%>
        </li>
        <li id="headerMenuPaging">
            <%--            <a href="/pagingList">소모임</a>--%>
        </li>
        <li id="headerMenus1" style="font-size: 12px; font-weight: bold">
        </li>
        <li class="login-name" id="headerlogin-area">
        </li>
    </ul>
</div>
<script>
    const loginArea = document.getElementById("headerlogin-area");
    const headermenu1 = document.getElementById("headerMenus1");
    const loginEmail = '${sessionScope.memberEmail}';
    const loginNickName = '${sessionScope.memberNickName}';
    if (loginEmail.length != 0) {
        headermenu1.innerHTML = "<a href='/bandMember/mypage?loginNickName=" + loginNickName + "\' style='color: yellow;'> loginNickName님 페이지!</a>"+
            "<a href='/bandMember/logout' style='float: right'>logout</a>";
        groupNavMenu1.innerHTML = "<a href='/bandGroup/memberRegGroup?groupName=" + groupName + "\' style='color: yellow;'>그룹가입하기</a>"

    } else {

    }
</script>