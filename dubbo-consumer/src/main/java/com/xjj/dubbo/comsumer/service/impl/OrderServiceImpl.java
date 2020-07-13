package com.xjj.dubbo.comsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xjj.dubbo.comsumer.service.OrderService;
import entity.UserAddress;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(Integer userId) {
        System.out.println("用户id："+userId);
        return userService.getUserAddressList();
    }
}
