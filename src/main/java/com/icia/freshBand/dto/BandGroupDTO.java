package com.icia.freshBand.dto;

import lombok.Data;

@Data
public class BandGroupDTO {
    private Long id;
    private String createMemberNickname;
    private String groupName;
    private int groupfileAttached;

}
