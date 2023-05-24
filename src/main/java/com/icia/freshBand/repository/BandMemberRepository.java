package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandMemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BandMemberRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int saveMember(BandMemberDTO bandMemberDTO) {
        System.out.println("bandMemberDTO = " + bandMemberDTO);
        int saveresult =sql.insert("BandMember.saveMember", bandMemberDTO);
            return saveresult;

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
}
