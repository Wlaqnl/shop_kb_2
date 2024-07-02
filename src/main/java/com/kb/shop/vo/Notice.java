package com.kb.shop.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private Long id;
    private String title;
    private String cnt;
    private int regiId;
    private String regiName;
    private String regiTime;
    private String amendId;
    private String amendName;
    private String amendTime;
    private String postStartTime;
    private String postEndTime;
    private Boolean del;
    private Boolean popup;
}