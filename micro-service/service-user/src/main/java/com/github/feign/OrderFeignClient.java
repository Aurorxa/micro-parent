package com.github.feign;

import com.github.bean.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "service-order")
public interface OrderFeignClient {

    @GetMapping("/order/info/{id}")
    List<OrderInfo> getOrderList(@PathVariable("id") Integer id);
}
