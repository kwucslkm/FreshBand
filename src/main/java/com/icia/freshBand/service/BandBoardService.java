package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandGroupBoardDTO;
import com.icia.freshBand.repository.BandBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandBoardService {
    @Autowired
    private BandBoardRepository bandBoardRepository;

    public void saveGroupBoard(BandGroupBoardDTO bandGroupBoardDTO) {
        bandBoardRepository.saveGroupBaord(bandGroupBoardDTO);
    }
}