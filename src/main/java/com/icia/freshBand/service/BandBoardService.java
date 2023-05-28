package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandGroupBoardDTO;
import com.icia.freshBand.repository.BandBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandBoardService {
    @Autowired
    private BandBoardRepository bandBoardRepository;


    public void saveGroupBoard(BandGroupBoardDTO bandGroupBoardDTO) {
        bandBoardRepository.saveGroupBoard(bandGroupBoardDTO);
    }

    public List<BandGroupBoardDTO> findBoardByGroupName(String groupName) {
        List<BandGroupBoardDTO> bandGroupBoardDTOList =bandBoardRepository.findBoardByGroupName(groupName);
        return bandGroupBoardDTOList;
    }
}
