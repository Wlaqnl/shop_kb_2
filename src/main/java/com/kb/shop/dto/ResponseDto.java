package com.kb.shop.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {
    private String msg;
    private String state;
}
