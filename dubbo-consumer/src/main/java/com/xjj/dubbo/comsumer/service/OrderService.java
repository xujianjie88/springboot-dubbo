package com.xjj.dubbo.comsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import entity.UserAddress;

import java.util.List;

public interface OrderService {
     List<UserAddress> initOrder(Integer userId);
}
