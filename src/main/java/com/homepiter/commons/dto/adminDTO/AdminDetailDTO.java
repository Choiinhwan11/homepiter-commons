package com.homepiter.commons.dto.adminDTO;


import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class AdminDetailDTO {

    private String adminId;
    private String adminName;
    private String adminPassword;
    private String adminPhone;
    private String adminEmail;
    private String adminAddress;



    private String adminRemark;
    private String adminStatus;



    private String adminCreateTime;
    private String adminUpdateTime;


}
