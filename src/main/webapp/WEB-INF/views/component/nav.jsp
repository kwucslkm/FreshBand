<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="nav">
    <ul>
        <li>
            <a href="/">
                <i class="bi bi-house"></i>
            </a>
        </li>
        <li id="navMenuSave">
<%--            <a href="/save_member">회원가입</a>--%>
        </li>
        <li id="navMenulogin">
<%--            <a href="/memberLogin">로그인</a>--%>
        </li>
        <li id="navMenuPaging">
<%--            <a href="/pagingList">소모임</a>--%>
        </li>
        <li id="navMenus1">

        </li>
        <li class="login-name" id="login-area">

        </li>
    </ul>
</div>

<script>
    // const loginArea = document.getElementById("login-area");
    const loginmenu1 = document.getElementById("navMenuSave");
    // const loginmenu2 = document.getElementById("navMenulogin");
    const navmenu1 = document.getElementById("navMenus1");
    const loginEmail = '${sessionScope.loginEmail}';
    console.log(loginEmail.length);

    if (loginEmail.length != 0) {
        loginmenu1.innerHTML = "<a href = '/bandGroup/save'>모임만들기</a>";
        if(loginEmail == 'admin'){
            navmenu1.innerHTML = "<a href='/memberList'>관리자페이지(회원목록)</a>";
        }

        navmenu1.innerHTML = "<a href='/mypage' style='color: yellow;'>"+${sessionScope.memberNickName} +" 님 페이지!</a>"+
                                "<a href='/logout'>logout</a>";
        loginmenu2.innerHTML = "<a href = \'/bandGroup/findGroupByEmail?="+loginEmail+"\'>내모임</a>";
                                // "<a href=\'/memberDelete?id="+memberId+"\'>회원삭제</a>";

    } else {
        loginArea.innerHTML = "<a href='/memberLogin'>login</a>";
    }
</script>