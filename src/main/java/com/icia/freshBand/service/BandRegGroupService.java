package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandRegGroupDTO;
import com.icia.freshBand.repository.BandRegGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandRegGroupService {
    @Autowired
    private BandRegGroupRepository bandRegGroupRepository;
    public void memberRegGroup(BandRegGroupDTO bandRegGroupDTO) {
        bandRegGroupRepository.memberRegGroup(bandRegGroupDTO);

    }

    public List<BandRegGroupDTO> findRegMemberByGroupName(String groupName) {
        List<BandRegGroupDTO> bandRegGroupDTOList = bandRegGroupRepository.findRegMemberByGroupName(groupName);
        return bandRegGroupDTOList;
    }
}
