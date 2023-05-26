package com.icia.freshBand.controller;

import com.icia.freshBand.dto.BandGroupDTO;
import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.dto.BandRegGroupDTO;
import com.icia.freshBand.service.BandGroupService;
import com.icia.freshBand.service.BandMemberService;
import com.icia.freshBand.service.BandRegGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/bandGroup")
public class BandGroupController {
    @Autowired
    private BandGroupService bandGroupService;
    @Autowired
    private BandMemberService bandMemberService;
    @Autowired
    private BandRegGroupService bandRegGroupService;

    @GetMapping("/save")
    public String save(HttpSession session, Model model) {
        String loginEmail = (String) session.getAttribute("memberEmail");
        System.out.println("sessionEmail = " + loginEmail);
        BandMemberDTO bandMemberDTO = bandMemberService.findMemberByEmail(loginEmail);
        System.out.println(bandMemberDTO);
        model.addAttribute("bandMember", bandMemberDTO);
        return "bandgroupPages/saveBandGroup";
    }

    @PostMapping("/save")
    public String saveGroup(@ModelAttribute BandGroupDTO bandGroupDTO, HttpSession session) {
//        String loginEmail = (String) session.getAttribute("memberEmail");
        String loginNickName = (String) session.getAttribute("memberNickName");
//        System.out.println("그룹폼에서 가져온bandGroupDTO = " + bandGroupDTO + ", session = " + session);
        BandGroupDTO groupDTO = bandGroupService.GroupSave(bandGroupDTO);
//        BandMemberDTO memberDTO = bandMemberService.findMemberByEmail(loginEmail);
        BandMemberDTO memberDTO = bandMemberService.findMemberByNickName(loginNickName);

//        BandRegGroupDTO bandRegGroupDTO = new BandRegGroupDTO();
//        bandRegGroupDTO.setRegGroupId(groupDTO.getId());
//        bandRegGroupDTO.setRegGroupName(groupDTO.getGroupName());
//        bandRegGroupDTO.setRegMemberNickname(loginNickName);
//        bandRegGroupDTO.setRegMemberId(memberDTO.getId());
//        bandRegGroupDTO.setGroupMaster(groupDTO.getCreateMemberNickname());
        bandRegGroupService.memberRegGroup(groupDTO,memberDTO,loginNickName);

        return "redirect:/bandGroup/List";
    }

    @GetMapping("/memberRegGroup")
    public String memberRegGroup(@RequestParam("groupName") String groupName, HttpSession session, Model model) {
//        String loginEmail = (String) session.getAttribute("memberEmail");
        String loginNickName = (String) session.getAttribute("memberNickName");
//        System.out.println("소모임가입에서온groupName = " + groupName);
        BandGroupDTO groupDTO = bandGroupService.findGroupByGroupName(groupName);
//        BandMemberDTO memberDTO = bandMemberService.findMemberByEmail(loginEmail);
        BandMemberDTO memberDTO = bandMemberService.findMemberByNickName(loginNickName);

//        BandRegGroupDTO bandRegGroupDTO = new BandRegGroupDTO();
//        bandRegGroupDTO.setRegGroupId(groupDTO.getId());
//        bandRegGroupDTO.setRegGroupName(groupDTO.getGroupName());
//        bandRegGroupDTO.setRegMemberNickname(loginNickName);
//        bandRegGroupDTO.setRegMemberId(memberDTO.getId());
//        bandRegGroupDTO.setGroupMaster(groupDTO.getCreateMemberNickname());
        bandRegGroupService.memberRegGroup(groupDTO,memberDTO,loginNickName);

        return "redirect:/bandGroup/List";

    }

    @GetMapping("/List")
    public String findGroupAll(Model model) {
        List<BandGroupDTO> bandGroupDTOList = bandGroupService.findGroupAll();
        System.out.println("생성된 그룹찾아온거= " + bandGroupDTOList);

        model.addAttribute("bandGroup", bandGroupDTOList);
        return "bandgroupPages/BandGroupList";

    }

    @GetMapping("/Detail")
    public String findGroupByGroupName(@RequestParam String groupName, HttpSession session, Model model) {

//        System.out.println("groupName = " + groupName);
        String loginNickName = (String) session.getAttribute("memberNickName");
        BandGroupDTO groupDTO = bandGroupService.findGroupByGroupName(groupName);
        List<BandRegGroupDTO> bandRegGroupDTOList = bandRegGroupService.findRegMemberByGroupName(groupName);
//        System.out.println("bandRegGroupDTOList = " + bandRegGroupDTOList);
        int regGroupListSize = bandRegGroupDTOList.size();
        int Rcount = 0;
        for (BandRegGroupDTO b : bandRegGroupDTOList) {
            Rcount++;
            if (loginNickName.equals(b.getRegMemberNickname())) {
                model.addAttribute("memberRegGroup", 1);
                System.out.println(b.getRegMemberNickname());
                break;
            }else {
                if (regGroupListSize==Rcount) {
                    model.addAttribute("memberRegGroup", 0);
                }
            }

        }
        model.addAttribute("bandGroup", groupDTO);
        return "bandgroupPages/BandGroupDetail";
    }

    @GetMapping("/findGroupByEmail")
    public String findGroupByEmail(@RequestParam("loginEmail") String loginEmail, Model model) {

        return "bandgroupPages/BandGroupDetail";
    }
}
