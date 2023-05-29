package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandMemberDTO;
import com.icia.freshBand.dto.BandProfileDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BandMemberRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public BandMemberDTO saveMember(BandMemberDTO bandMemberDTO) {
        System.out.println("bandMemberDTO = " + bandMemberDTO);
        int saveresult =sql.insert("BandMember.saveMember", bandMemberDTO);
        System.out.println("bandMemberDTO = " + bandMemberDTO);


            return bandMemberDTO;

    }

    public BandMemberDTO memberLogin(BandMemberDTO bandMemberDTO) {
        BandMemberDTO memberDTO = sql.selectOne("BandMember.loginChk",bandMemberDTO);
        return memberDTO;

    }

    public List<BandMemberDTO> findMemberAll() {
        List<BandMemberDTO> bandMemberDTOList = sql.selectList("BandMember.findMemberAll");
        return bandMemberDTOList;
    }

    public BandMemberDTO findMemberByEmail(String loginEmail) {

        BandMemberDTO memberDTO = sql.selectOne("BandMember.findMemberByEmail",loginEmail);
        System.out.println("db에서 가져온memberDTO = " + memberDTO);
        return memberDTO;
    }

    public BandMemberDTO findMemberByNickName(String loginNickNamme) {
        BandMemberDTO memberDTO = sql.selectOne("BandMember.findMemberByNickName",loginNickNamme);
        System.out.println("db에서 가져온memberDTO = " + memberDTO);
        return memberDTO;
    }

    public void saveMemberProfile(BandProfileDTO bandProfileDTO) {
        sql.insert("BandMember.saveProfileFile",bandProfileDTO);
    }

    public BandProfileDTO findMemberProfile(Long memberId) {
        BandProfileDTO bandProfileDTO = sql.selectOne("BandMember.findMemberProfile",memberId);
        return bandProfileDTO;
    }
}
