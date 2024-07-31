package com.kb.shop.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindNoticeRequestDto {
    // 검색 조건
    private String searchTitle;
    private String searchRegiEmp;

    // 페이징
    private int pageNo;
    private int pageSize;

    // 정렬
    private String orderTitle; // 'DESC', 'ASC'
    private String orderRegiEmp;

    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }

//    private List<Map<String,String>> search;
//    private Map<String, Object> pagination;
//    private FindNoticeOrderDto order;
}
