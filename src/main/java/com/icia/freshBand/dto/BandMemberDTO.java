package com.icia.freshBand.dto;

import lombok.Data;

@Data
public class BandMemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberNickname;
    private String memberLocal;
    private String memberInterest;
    private String memberMobile;
    private int memberProfile;


}
