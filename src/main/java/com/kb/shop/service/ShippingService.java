package com.kb.shop.service;

import com.kb.shop.dao.ShippingDao;
import com.kb.shop.domain.Order;
import com.kb.shop.domain.OrderItem;
import com.kb.shop.domain.Product;
import com.kb.shop.domain.ShippingInfo;
import com.kb.shop.domain.dto.CreateShippingInfoDto;
import com.kb.shop.domain.dto.ShippingInfoDto;
import com.kb.shop.repository.OrderItemRepository;
import com.kb.shop.repository.OrderRepository;
import com.kb.shop.repository.ProductRepository;
import com.kb.shop.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ShippingService {
    @Autowired
    private ShippingRepository shippingRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ShippingDao shippingDao;

    public int insert(CreateShippingInfoDto shippingDto) {
//        System.out.println(shippingDto);
        int result = shippingDao.insert(shippingDto);
        return result;
    }

    public List<ShippingInfoDto> findAll(Integer page, Integer pageSize, String title) {
        List<ShippingInfoDto> result = shippingDao.findAll( page,  pageSize,  title);
        return result;
    }

    public ShippingInfo findById(Long id) {
        return shippingRepository.findById(id).orElse(null);
    }

//    public ShippingInfo save(CreateShippingInfoDto shipping) {
//        Order order = orderRepository.findById(shipping.getOrderId()).orElse(null);
//        if (order == null) return null;
//        OrderItem orderItem = orderItemRepository.findById(shipping.getOrderItemId()).orElse(null);
//        if (orderItem == null) return null;
//        ShippingInfo shippingInfo = ShippingInfo.builder().order(order).orderItem(orderItem).shippingStatus(shipping.getShippingStatus()).build();

//        return shippingRepository.save(shippingInfo);
//    }

    public ShippingInfo modify(ShippingInfo shipping) {
        ShippingInfo targetShipping = this.findById(shipping.getId());
        targetShipping.setShippingStatus(shipping.getShippingStatus());
        return shippingRepository.save(targetShipping);
    }
}
