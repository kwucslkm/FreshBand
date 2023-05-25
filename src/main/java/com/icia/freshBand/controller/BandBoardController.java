package com.icia.freshBand.controller;

import com.icia.freshBand.dto.BandGroupBoardDTO;
import com.icia.freshBand.service.BandBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/bandBoard")
public class BandBoardController {
    @Autowired
    private BandBoardService bandBoardService;
    @GetMapping("/save")
    public String boardSave(@RequestParam("groupName") String groupName, HttpSession session, Model model){
        System.out.println("그룹디테일에서온groupName = " + groupName);
        String loginNickName = (String) session.getAttribute("memberNickName");
        System.out.println("세션에로그인닉네임  = " + loginNickName);
        return "bandBoardPages/saveBandGroupBorad";
    }
    @PostMapping("/save")
    public String boardSave(@ModelAttribute BandGroupBoardDTO bandGroupBoardDTO, Model model){

        return "index";
    }


}
