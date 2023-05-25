package com.icia.freshBand.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BandRegGroupDTO {
    private  Long id;
    private  Long regMemberId;
    private  String  regMemberNickname;
    private  Long regGroupId;
    private  String  regGroupName;
    private  String  groupMaster;
    private Timestamp GroupRegDate;

}
