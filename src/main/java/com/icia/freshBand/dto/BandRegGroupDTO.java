package com.icia.freshBand.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BandRegGroupDTO {
    private  Long id;
    private  Long regMemberId;
    private  Long regGroupId;
    private  String  regMemberNickname;
    private  String  regGroupName;
    private Timestamp GroupRegDate;

}
