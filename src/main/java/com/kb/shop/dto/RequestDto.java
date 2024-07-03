package com.kb.shop.dto;

import lombok.Data;

@Data
public class RequestDto {
    /*
    private Long id;
    private String title;
    private String cnt;
    private int regiId;
    private String regiName;
    private String regiTime;
     */

    private Long 공지사항일련번호;
    private String 공지사항제목;
    private String 공지사항내용;
    private int 등록직원번호;
    private String 등록직원명;
    private String 등록일시;
}
