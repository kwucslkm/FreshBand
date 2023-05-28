package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandGroupBoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BandBoardRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void saveGroupBoard(BandGroupBoardDTO bandGroupBoardDTO) {
        sql.insert("BandGroupBoard.saveGroupBoard",bandGroupBoardDTO);
    }

    public List<BandGroupBoardDTO> findBoardByGroupName(String groupName) {
        List<BandGroupBoardDTO> bandGroupBoardDTOList = sql.selectList("BandGroupBoard.findBoardByGroupName",groupName);
        return bandGroupBoardDTOList;
    }
}
