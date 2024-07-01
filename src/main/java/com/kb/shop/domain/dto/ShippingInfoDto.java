package com.kb.shop.domain.dto;

import com.kb.shop.domain.enums.ShippingStatus;
import lombok.Data;

@Data
public class ShippingInfoDto {
    private Long id;
    private Long orderId;
    private Long orderItemId;
    private String shippingStatus;
}
