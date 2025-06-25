package com.homepiter.commons.dto.adminDTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor


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
