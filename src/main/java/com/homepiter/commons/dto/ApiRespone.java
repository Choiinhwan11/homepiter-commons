package com.homepiter.commons.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public class ApiRespone <T>{

    private final String message ;
    private final Boolean success ;
    private final T data ;
    private final LocalDateTime timestamp ;


    /*생성자*/
    @Builder
    private ApiRespone(String message, Boolean success, T data, LocalDateTime timestamp) {
        this.message = message;
        this.success = success;
        this.data = data;
        this.timestamp = timestamp;
    }

    /*api respone success */
    public static <T> ApiRespone<T> success(T data) {
        return ApiRespone.<T>builder()
                .success(true)
                .data(data)
                .message("success")
                .build();
    }

    /*api respone false */
    public static <T> ApiRespone<T> failure(String message) {
        return ApiRespone.<T>builder()
                .success(false)
                .data(null)
                .message(message)
                .build();
    }






}
