package com.github.order.controller;

import com.github.bean.OrderInfo;
import com.github.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-13 10:35:57
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/info/{id}")
    public List<OrderInfo> getOrderList(@PathVariable("id") Integer id) {
        return orderService.getUserInfo(id);
    }
}