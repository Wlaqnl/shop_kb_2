package com.kb.shop.dto.test;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestNoticePaginationDto {
    //페이징
    private int pageNo;
    private int pageSize;

    //정렬
    private String sortColumn;
    private boolean reverse;

    //페이지 계산
    public int getOffset(){
        return (pageNo-1)*pageSize;
    }
}
