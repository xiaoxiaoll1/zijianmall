package com.zijianmall.order.dao;

import com.zijianmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zijian
 * @email miraclexiao8@gmail.com
 * @date 2020-12-26 21:01:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
