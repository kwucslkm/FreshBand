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
        <li class="login-name" id="login-area">
        </li>
    </ul>
</div>

<script>
    // const loginArea = document.getElementById("login-area");
    const groupNavMenu1 = document.getElementById("navRegGroup");
    <%--const loginmenu2 = document.getElementById("navMenulogin");--%>
    <%--const navmenu1 = document.getElementById("navMenus1");--%>
    <%--const loginNick = ${sessionScope.memberNickName};--%>
    <%--const groupMaster = ${bandGroup.createMemberNickname};--%>
    <%--const groupName = '${bandGroup.groupName}';--%>
    <%--const loginEmail = '${sessionScope.memberEmail}';--%>
    <%--const loginNickName = '${sessionScope.memberNickName}';--%>
    <%--console.log('${sessionScope.memberEmail}'.length);--%>
    <%--console.log('${sessionScope.memberEmail}');--%>
    const groupName = '${bandGroup.groupName}';
    console.log('${memberRegGroup==0}');
    console.log('${sessionScope.memberNickName}' != '${bandGroup.createMemberNickname}')
    if (${memberRegGroup==0}) {
        if ('${sessionScope.memberNickName}' != '${bandGroup.createMemberNickname}') {
            console.log("되나?")
            console.log('groupName');
            // groupNavMenu1.innerHTML = <a href='/bandMember/mypage' style='color: yellow;'>"이그룹가입하기";
            groupNavMenu1.innerHTML = "<a href='/bandGroup/memberRegGroup?groupName=" + groupName + "\' style='color: yellow;'>이그룹가입하기</a>"
        }else{

        }
    }
</script>