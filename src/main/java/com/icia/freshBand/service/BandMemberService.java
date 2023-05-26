package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.repository.BandMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandMemberService {
    @Autowired
    private BandMemberRepository bandMemberRepository;


    public int saveMember(BandMemberDTO bandMemberDTO) {
        int saveResult = bandMemberRepository.saveMember(bandMemberDTO);
        return saveResult;
    }

    public BandMemberDTO memberLogin(BandMemberDTO bandMemberDTO) {
        BandMemberDTO memberDTO = bandMemberRepository.memberLogin(bandMemberDTO);
        return memberDTO;
    }

    public List<BandMemberDTO> findMemberAll() {
        List<BandMemberDTO> bandMemberDTOList = bandMemberRepository.findMemberAll();
        return bandMemberDTOList;
    }
    public BandMemberDTO findMemberByEmail(String loginEmail){
//        System.out.println("서비스loginEmail = " + loginEmail);
        BandMemberDTO memberDTO = bandMemberRepository.findMemberByEmail(loginEmail);
        return memberDTO;

    }
    public BandMemberDTO findMemberByNickName(String loginNickNamme){
//        System.out.println("서비스loginEmail = " + loginEmail);
        BandMemberDTO memberDTO = bandMemberRepository.findMemberByNickName(loginNickNamme);
        return memberDTO;

    }
}
