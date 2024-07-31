package com.kb.shop.dto;

import com.kb.shop.vo.Notice;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindNoticeResponseDto {
    private List<Notice> contents;
    private FindNoticePaginationDto pagination;
}
