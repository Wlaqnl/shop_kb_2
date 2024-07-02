package com.kb.shop.dto;

import lombok.Data;

@Data
public class RequestDto {
    private Long id;
    private String title;
    private String cnt;
    private int regiId;
    private String regiName;
    private String regiTime;
}
