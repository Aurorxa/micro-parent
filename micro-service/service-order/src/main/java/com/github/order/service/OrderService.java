package com.github.order.service;

import com.github.bean.OrderInfo;
import com.github.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-13 10:35:57
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Transactional(readOnly = true)
    public List<OrderInfo> getUserInfo(Integer uid) {
       return orderMapper.getOrderList(uid);
    }
}
