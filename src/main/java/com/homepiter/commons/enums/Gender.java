package com.homepiter.commons.enums;

public enum Gender {
    male, female, unknown;

    // 네이버 API 응답 값을 UserGender Enum으로 변환
    public static Gender fromNaverValue(String value) {
        if ("M".equalsIgnoreCase(value)) {
            return male;
        } else if ("F".equalsIgnoreCase(value)) {
            return female;
        }
        return unknown;  // 예외적인 값이 들어올 경우 기본값
    }
}
