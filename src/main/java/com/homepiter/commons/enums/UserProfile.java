package com.homepiter.commons.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {

    @Id
    private Long id;
    //대표 이미지 URL
    private String profileBackImgURL;

    //프로필 이미지 URL
    private String profileImgURL;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


}
