package com.HiO.Backend.server.common.dto;

import com.HiO.Backend.server.common.CommonResponse;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class CommonResponseDto implements CommonResponse {

    private String path;
    private String method;
    private Object data;
    private String message;
    private int statusCode;
    private LocalDateTime timestamp;

    protected CommonResponseDto(final String path, final String method, final Object data, final String message, final int statusCode) {
        this.path = path;
        this.method = method;
        this.data = data;
        this.message = message;
        this.statusCode = statusCode;
        this.timestamp = LocalDateTime.now();
    }

}
