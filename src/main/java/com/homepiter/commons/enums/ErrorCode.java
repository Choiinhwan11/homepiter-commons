package com.homepiter.commons.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {

    USER_NOT_FOUND("USER_NOT_FOUND", "유저를 찾을 수 없습니다."),
    INVALID_REQUEST("INVALID_REQUEST", "잘못된 요청입니다."),
    ACCESS_DENIED("ACCESS_DENIED", "접근이 거부되었습니다."),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", "서버 오류가 발생했습니다.");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
