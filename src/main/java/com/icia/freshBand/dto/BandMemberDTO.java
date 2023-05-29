package com.icia.freshBand.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
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
    private File memberProfileFile;


}
