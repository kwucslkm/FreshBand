package com.icia.freshBand.controller;

import com.icia.freshBand.dto.BandGroupDTO;
import com.icia.freshBand.service.BandGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bandGroup")
public class BandGroupController {
    @Autowired
    private BandGroupService bandGroupService;

    @GetMapping("/save")
    public String save(){
        return "bandgroupPages/saveBandGroup";
    }
    @PostMapping("/save")
    public String saveGroup(@ModelAttribute BandGroupDTO bandGroupDTO){

        return "bandgroupPages/BandGroupList";
    }
    @GetMapping("/List")
    public String findGroupAll(Model model){
        List<BandGroupDTO> bandGroupDTOList = bandGroupService.findGroupAll();

        model.addAttribute("bandGroup",bandGroupDTOList);
        return "bandgroupPages/BandGroupList";

    }
    @GetMapping("/findGroupByEmail")
    public String findGroupByEmail(@RequestParam("loginEmail") String loginEmail,Model model){
        return "bandgroupPages/BandGroupDetail";
    }
}
