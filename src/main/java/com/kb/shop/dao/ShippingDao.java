package com.kb.shop.dao;

import com.kb.shop.domain.ShippingInfo;

import com.kb.shop.domain.dto.CreateShippingInfoDto;
import com.kb.shop.domain.dto.ShippingInfoDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ShippingDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public int insert(CreateShippingInfoDto shippingInfoDto) {
        int result = sqlSession.insert("ShippingMapper.insert", shippingInfoDto);
        return result;
    }

    public List<ShippingInfoDto> findAll(Integer page, Integer pageSize, String title) {
        Map<String, Object> params = new HashMap<>();
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("title", title);
        List<ShippingInfoDto> shippingInfoList = sqlSession.selectList("ShippingMapper.findAll", params);
        return shippingInfoList;
    }
}
