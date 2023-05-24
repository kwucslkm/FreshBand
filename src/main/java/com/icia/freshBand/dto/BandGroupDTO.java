package com.icia.freshBand.dto;

import lombok.Data;

@Data
public class BandGroupDTO {
    private Long id;
    private String createMemberNickname;
    private String createMemberLocal;
    private String createMemberInterest;
    private String groupName;
    private String groupIntro;
    private int groupFileAttached;

}
