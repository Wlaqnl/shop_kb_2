package com.kb.shop.dto;

import lombok.Data;

@Data
public class FindNoticeOrderDto {
    private String orderTitle; // 'DESC', 'ASC'
    private String orderRegiEmp;
}
