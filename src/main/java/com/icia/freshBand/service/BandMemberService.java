package com.icia.freshBand.service;

import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.dto.BandProfileDTO;
import com.icia.freshBand.repository.BandMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class BandMemberService {
    @Autowired
    private BandMemberRepository bandMemberRepository;

    public BandMemberDTO saveMember(BandMemberDTO bandMemberDTO) throws IOException {
        System.out.println(bandMemberDTO.getMemberProfileFile().isEmpty());
        if (bandMemberDTO.getMemberProfileFile().isEmpty()){
            bandMemberDTO.setMemberProfile(0);
            BandMemberDTO memberDTO = bandMemberRepository.saveMember(bandMemberDTO);

        return memberDTO;

        }else{
            bandMemberDTO.setMemberProfile(1);
            BandMemberDTO memberDTO = bandMemberRepository.saveMember(bandMemberDTO);
            MultipartFile profileFile = memberDTO.getMemberProfileFile();
            String profileFileName = profileFile.getOriginalFilename();
            System.out.println("profileFileName = " + profileFileName);
            System.out.println(memberDTO.getId());
            String storedFileName = System.currentTimeMillis()+"-"+profileFileName;
            BandProfileDTO bandProfileDTO = new BandProfileDTO();
            bandProfileDTO.setMemberId(memberDTO.getId());
            bandProfileDTO.setProfileFileName(profileFileName);
            bandProfileDTO.setProfileStoredFileName(storedFileName);

            String savePath = "D:\\springframework_img\\"+storedFileName;
            profileFile.transferTo(new File(savePath));
            bandMemberRepository.saveMemberProfile(bandProfileDTO);
//            for(MultipartFile memberprofileFile : memberDTO.getMemberProfileFile()){
//                String profileFileName = memberprofileFile.getOriginalFilename();
//                System.out.println("profileFileName = " + profileFileName);
//                //저장용 이름 만들기
//                System.out.println(System.currentTimeMillis());
//                System.out.println(UUID.randomUUID().toString());
//                String storedFileName = System.currentTimeMillis()+"-"+profileFileName;
//                MemberProfileFileDTO memberProfileFileDTO = new MemberProfileFileDTO();
//                memberProfileFileDTO.setProfileFileName(profileFileName);
//                memberProfileFileDTO.setProfileStoredFileName(storedFileName);
//                memberProfileFileDTO.setMemberId(dto.getId());
//                //로컬에 파일 저장
//                //저장할 경로 설정 (저장할폴더+저장할이름)
////                String savePath = "D:\\springframework_img\\"+storedFileName;
//                String savePath = "C:\\javaspring\\springframework_img\\"+storedFileName;
//                //저장처리
//                memberprofileFile.transferTo(new File(savePath));
//                memberRepository.saveprofileFile(memberProfileFileDTO);
//            }

        return memberDTO;
        }
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

    public BandProfileDTO findMemberProfile(Long memberId) {
        BandProfileDTO bandProfileDTO = bandMemberRepository.findMemberProfile(memberId);
        return bandProfileDTO;
    }
}
