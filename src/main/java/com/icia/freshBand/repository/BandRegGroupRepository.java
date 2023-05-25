package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandRegGroupDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BandRegGroupRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void memberRegGroup(BandRegGroupDTO bandRegGroupDTO) {
        sql.insert("BandRegGroup.bandRegGroupSave",bandRegGroupDTO);

    }

    public List<BandRegGroupDTO> findRegMemberByGroupName(String groupName) {
        List<BandRegGroupDTO> bandRegGroupDTOList = sql.selectList("BandRegGroup.findRegMemberByGroupName",groupName);
        return bandRegGroupDTOList;
    }
}
