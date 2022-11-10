package com.HiO.Backend.server.common.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * CommonResponseDto 부터 상속받아 데이터를 가공한다.
 *
 * @author : alivejuicy
 */
@Getter
public class ResponseDto extends CommonResponseDto {
    private ResponseDto() {
        super();
    }

    @Builder
    public ResponseDto(final String path, final String method, final Object data, final String message, final int statusCode) {
        super(path, method, data, message, statusCode);
    }
}
