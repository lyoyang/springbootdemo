package com.lyoyang.springsecurity.dto;

import com.lyoyang.springsecurity.enums.ResponseEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvcResponseDto<T> {


    private String code;
    private String message;
    private T data;


    public static MvcResponseDto getFailInstance() {
        return MvcResponseDto.builder()
                .code(ResponseEnum.FAIL.getCode())
                .message(ResponseEnum.FAIL.getMessage())
                .build();
    }

    public static MvcResponseDto getSuccessInstance() {
        return MvcResponseDto.builder()
                .code(ResponseEnum.SUCCESS.getCode())
                .message(ResponseEnum.SUCCESS.getMessage())
                .build();
    }

    public static <K> MvcResponseDto<K> getSuccessInstance(K data) {
        MvcResponseDto<K> mvcResponseDto = new MvcResponseDto<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), data);
        return mvcResponseDto;
    }

}
