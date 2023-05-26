package com.icia.freshBand.repository;

import com.icia.freshBand.dto.BandGroupBoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BandBoardRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void saveGroupBaord(BandGroupBoardDTO bandGroupBoardDTO) {
        sql.insert("BandGroupBoard.saveGroupBoard",bandGroupBoardDTO);
    }
}
