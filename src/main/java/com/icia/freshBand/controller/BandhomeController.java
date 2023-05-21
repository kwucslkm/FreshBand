package com.icia.freshBand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BandhomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}

//** 파스칼케이스(pascal case)
//
//        : 두 단어 이상 연결할 때 첫 글자와 중간 글자들이 대문자인 경우
//        ** 카멜케이스(camel case)
//        : 두 단어 이상 연결할 때 중간 글자들은 대문자로 시작하지만 첫 글자가 소문자인 경우
//        ​
//        1. Naming Rules
//        a. id, class
//i. 두 단어 이상 연결할 때는 대시로 연결
//        ii. member-email, board-writer 등
//        b. javascript function name
//        i. 두 단어 이상 연결할 때는 언더바(_)로 연결
//        ii. member_check, password_check 등
//        c. name 속성값
//        i. 두 단어 이상 연결할 때는 camel case로 작성
//        ii. memberEmail, boardWriter 등