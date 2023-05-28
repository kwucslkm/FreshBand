package com.icia.freshBand.dto;

import lombok.Data;

@Data
public class BandGroupBoardDTO {
    private Long id;
    private Long memberId;
    private Long groupId;
    private String bandBoardWriter;
    private String bandBoardTitle;
    private String bandBoardContents;
    private String createMemberLocal;
    private String createMemberInterest;
    private String groupName;
    private String bandBoardCreatedDate;
    private int bandBoardHits;
    private int bandBoardFileAttached;


}
