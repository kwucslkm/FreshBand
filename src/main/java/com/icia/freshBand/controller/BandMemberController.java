package com.icia.freshBand.controller;

import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.service.BandMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/bandMember")
public class BandMemberController {
    @Autowired
    private BandMemberService bandMemberService;

    @GetMapping("/save")
    public String saveMember() {
        return "bandmemberPages/saveBandMember";
    }

    @PostMapping("/save")
    public String saveMember(@ModelAttribute BandMemberDTO bandMemberDTO, Model model) {
        int saveResult = bandMemberService.saveMember(bandMemberDTO);
        if (saveResult == 1) {
            model.addAttribute("saveResult", saveResult);
        }
        return "bandmemberPages/memberLogin";
    }

    @GetMapping("/Login")
    public String login() {
        return "bandmemberPages/memberLogin";
    }

    @PostMapping("/Login")
    public String memberLogin(@ModelAttribute BandMemberDTO bandMemberDTO, HttpSession session, Model model) {
//        System.out.println("jsp에서 온rDTO = " + bandMemberDTO);
        BandMemberDTO memberDTO = bandMemberService.memberLogin(bandMemberDTO);
//        System.out.println("디비에서 받아온memberDTO = " + memberDTO);
        if (memberDTO == null) {
            System.out.println("로그인실패");
            return "redirect:/bandMember/Login";

        } else {
            session.setAttribute("memberEmail", memberDTO.getMemberEmail());
            session.setAttribute("memberNickName", memberDTO.getMemberNickname());
//            System.out.println("memberDTO = " + memberDTO);
            String loginEmail = (String) session.getAttribute("memberEmail");
            String loginNick = (String) session.getAttribute("memberNickName");
//            System.out.println("loginEmail = " + loginEmail);
            System.out.println("loginNick = " + loginNick);
            return "redirect:/bandGroup/List";
        }

    }
    @GetMapping("/List")
    public String findMemberAll(Model model){
        List<BandMemberDTO> bandMemberDTOList= bandMemberService.findMemberAll();
        System.out.println("bandMemberDTOList = " + bandMemberDTOList);
        model.addAttribute("bandMember",bandMemberDTOList);
        return "bandmemberPages/BandMemberList";
    }
    @GetMapping("/logout")
    public String memberLogout(HttpSession session){
        session.invalidate();
        return "redirect:/bandMember/Login";
    }

}
