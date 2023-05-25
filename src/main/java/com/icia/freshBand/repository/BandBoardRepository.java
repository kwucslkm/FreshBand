package com.icia.freshBand.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BandBoardRepository {
    @Autowired
    private SqlSessionTemplate sql;

}
