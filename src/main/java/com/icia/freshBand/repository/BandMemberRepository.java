package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandMemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
