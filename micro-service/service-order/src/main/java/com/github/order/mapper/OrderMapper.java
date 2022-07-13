package com.github.order.mapper;

import com.github.bean.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-13 10:35:57
 */
@Mapper
public interface OrderMapper {

    @Select("select oid,uid,product_name productName from orderinfo where uid = #{uid}")
    List<OrderInfo> getOrderList(Integer uid);
}
