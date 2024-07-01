package com.kb.shop.controller;

import com.kb.shop.domain.ShippingInfo;
import com.kb.shop.domain.dto.CreateShippingInfoDto;
import com.kb.shop.domain.dto.ShippingInfoDto;
import com.kb.shop.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    // 배송 정보를 생성하는 POST 호출을 생성합니다. (path : /shipping)
    @PostMapping("/shipping")
    public String addShipping(@RequestBody CreateShippingInfoDto shippingDto) {
        int result = shippingService.insert(shippingDto);
//        ShippingInfo result = shippingService.save(shippingDto);
        return result == 1 ? "성공" : "실패";
    }

    // 배송 Status를 변경하는 PUT 호출을 생성합니다. (path : /shipping)
    @PutMapping("/shipping")
    public ResponseEntity<Map<String, String>> modifyShipping(@ModelAttribute("shipping") ShippingInfo shipping) {
        ShippingInfo result = shippingService.modify(shipping);
        Map<String, String> response = new HashMap<>();
        response.put("result", String.valueOf(result));
        response.put("msg", "수정 성공");
        response.put("result", String.valueOf(result));

        return ResponseEntity.ok().body(response);
    }

    // 배송 정보를 확인하는 GET 호출을 생성합니다.  (path : /shipping)
    @GetMapping("/shipping")
    public List<ShippingInfoDto> findShipping(@RequestParam Integer page, @RequestParam Integer pageSize, @RequestParam String title ) {
        List<ShippingInfoDto> result = shippingService.findAll(page, pageSize, title);
        return result;
    }

    public void test(String a) {
        System.out.println(a);
    }

    @GetMapping("/shipping/{id}")
    public ResponseEntity<Map<String, String>> findShippingById(@PathVariable Long id) {

        ShippingInfo shipping = shippingService.findById(id);
        Map<String, String> response = new HashMap<>();
        response.put("result", String.valueOf(shipping));

        return ResponseEntity.ok().body(response);
    }
}
