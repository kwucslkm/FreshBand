package com.icia.freshBand.dto;

import lombok.Data;

@Data
public class BandProfileDTO {
    private Long id;
    private Long memberId;
    private String profileFileName;
    private String profileStoredFileName;


}
