package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandGroupDTO;
import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.dto.BandRegGroupDTO;
import com.icia.freshBand.repository.BandRegGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandRegGroupService {
    @Autowired
    private BandRegGroupRepository bandRegGroupRepository;
//    public void memberRegGroup(BandRegGroupDTO bandRegGroupDTO) {
//        bandRegGroupRepository.memberRegGroup(bandRegGroupDTO);
//    }
    public void memberRegGroup(BandGroupDTO groupDTO, BandMemberDTO memberDTO, String loginNickName) {
        BandRegGroupDTO bandRegGroupDTO = new BandRegGroupDTO();
        bandRegGroupDTO.setRegGroupId(groupDTO.getId());
        bandRegGroupDTO.setRegGroupName(groupDTO.getGroupName());
        bandRegGroupDTO.setRegMemberNickname(loginNickName);
        bandRegGroupDTO.setRegMemberId(memberDTO.getId());
        bandRegGroupDTO.setGroupMaster(groupDTO.getCreateMemberNickname());
        bandRegGroupRepository.memberRegGroup(bandRegGroupDTO);

    }

    public List<BandRegGroupDTO> findRegMemberByGroupName(String groupName) {
        List<BandRegGroupDTO> bandRegGroupDTOList = bandRegGroupRepository.findRegMemberByGroupName(groupName);
        return bandRegGroupDTOList;
    }


}
