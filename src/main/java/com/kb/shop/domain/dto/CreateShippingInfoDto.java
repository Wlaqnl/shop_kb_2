package com.kb.shop.domain.dto;

import com.kb.shop.domain.enums.ShippingStatus;
import lombok.Data;

@Data
public class CreateShippingInfoDto {
    private Long id;

    private Long orderId;

    private Long orderItemId;

    private Integer shippingStatus;
}
