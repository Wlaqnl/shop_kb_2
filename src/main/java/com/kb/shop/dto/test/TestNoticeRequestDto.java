package com.kb.shop.dto.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TestNoticeRequestDto {
    //검색 조건
    private List<TestNoticeSearchDto> search;
    private TestNoticePaginationDto pagination;
}
