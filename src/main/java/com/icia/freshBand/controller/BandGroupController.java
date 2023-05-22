package com.icia.freshBand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bandGroup")
public class BandGroupController {
    @GetMapping()
    public String saveGroup(){
        return "bandgroupPages/saveBandGroup";
    }
}
