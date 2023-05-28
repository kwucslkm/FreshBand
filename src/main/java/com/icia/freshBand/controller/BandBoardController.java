package com.icia.freshBand.controller;

import com.icia.freshBand.dto.BandGroupBoardDTO;
import com.icia.freshBand.dto.BandGroupDTO;
import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.service.BandBoardService;
import com.icia.freshBand.service.BandGroupService;
import com.icia.freshBand.service.BandMemberService;
import com.icia.freshBand.service.BandRegGroupService;
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
    @Autowired
    private BandMemberService bandMemberService;
    @Autowired
    private BandGroupService bandGroupService;
    @GetMapping("/save")
    public String boardSave(@RequestParam("groupName") String groupName, HttpSession session, Model model){
        String loginNickName = (String) session.getAttribute("memberNickName");
        BandGroupDTO groupDTO = bandGroupService.findGroupByGroupName(groupName);
        BandMemberDTO memberDTO = bandMemberService.findMemberByNickName(loginNickName);
        model.addAttribute("group",groupDTO);
        model.addAttribute("member",memberDTO);
        return "bandBoardPages/saveBandGroupBorad";
    }
    @PostMapping("/save")
    public String boardSave(@ModelAttribute BandGroupBoardDTO bandGroupBoardDTO, Model model){
        bandBoardService.saveGroupBoard(bandGroupBoardDTO);
        return "index";
    }


}
