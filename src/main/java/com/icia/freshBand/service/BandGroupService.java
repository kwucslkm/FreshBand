package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandGroupDTO;
import com.icia.freshBand.repository.BandGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class BandGroupService {
    @Autowired
    private BandGroupRepository bandGroupRepository;


    public List<BandGroupDTO> findGroupAll() {
        List<BandGroupDTO> bandGroupDTOList = bandGroupRepository.findGroupAll();
        return bandGroupDTOList;
    }
}
