package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandGroupDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BandGroupRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public List<BandGroupDTO> findGroupAll() {
        List<BandGroupDTO> bandGroupDTOList = sql.selectList("BandGroup.findGroupAll");
        return bandGroupDTOList;
    }
}
