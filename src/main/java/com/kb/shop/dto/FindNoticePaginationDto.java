package com.kb.shop.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindNoticePaginationDto {
    private int pageNo; // 없어도 됌
    private int pageSize; // 없어도 됌
    private int totalPage;
    private int totalContents;
}
