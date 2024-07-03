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
    /*
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
     */

    private Long 공지사항일련번호;
    private String 공지사항제목;
    private String 공지사항내용;
    private String 등록직원번호;
    private String 등록직원명;
    private String 등록일시;
    private String 수정직원번호;
    private String 수정직원명;
    private String 수정일시;
    private String 게시시작일시;
    private String 게시종료일시;
    private Boolean 삭제;
    private Boolean 팝업;
}